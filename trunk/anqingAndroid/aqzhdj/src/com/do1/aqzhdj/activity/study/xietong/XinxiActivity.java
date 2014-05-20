package com.do1.aqzhdj.activity.study.xietong;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cn.com.do1.component.util.ListenerHelper;

import com.androidquery.AQuery;
import com.do1.aqzhdj.R;
import com.do1.aqzhdj.activity.common.WapViewActivity;
import com.do1.aqzhdj.activity.common.WapViewActivity2;
import com.do1.aqzhdj.activity.parent.BaseActivity;
import com.do1.aqzhdj.activity.parent.BaseListActivity;
import com.do1.aqzhdj.activity.parent.BaseListActivity.ItemViewHandler;
import com.do1.aqzhdj.activity.study.gongkao.Zhaolu_detailActivity;
import com.do1.aqzhdj.util.Constants;

public class XinxiActivity extends BaseListActivity implements ItemViewHandler {
	Context context;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.study_xietong_xinxi);
		context = this;
		// 请求列表
		String[] keys = new String[] { "title", "nigaodanwei", "fawendate" };
		int[] ids = new int[] { R.id.title, R.id.author, R.id.sendTime };
		setCusItemViewHandler(this);
		Map<String, Object> map = new HashMap<String, Object>();
		setAdapterParams(keys, ids, R.layout.masses_xietong_item, map);

		// doRequest(1, getString(R.string.info_list));

		// ListenerHelper.bindOnCLickListener(this, this, R.id.one1, R.id.one2,
		// R.id.one3);
	}

	@Override
	public void handleItemView(BaseAdapter adapter, int position,
			View itemView, ViewGroup parent) {
		// TODO Auto-generated method stub
		AQuery a = new AQuery(itemView);
		TextView txttitle = a.find(R.id.title).getTextView();
		TextView txtauthor = a.find(R.id.author).getTextView();
		TextView txttime = a.find(R.id.sendTime).getTextView();

		String type = mSlpControll.getmListData().get(position).get("type")
				.toString();
		String title = mSlpControll.getmListData().get(position).get("title")
				.toString();
		String author = mSlpControll.getmListData().get(position)
				.get("creater").toString();
		String time = mSlpControll.getmListData().get(position).get("cdate")
				.toString();

		txttitle.setText(Html.fromHtml(type+ title));
		txtauthor.setText(Html.fromHtml(author));
		txttime.setText(Html.fromHtml(time));
	}

	@Override
	protected void itemClick(AdapterView<?> parent, View view, int position,
			long id) {
		super.itemClick(parent, view, position, id);

		String url = mSlpControll.getmListData().get(position).get("url")
				.toString();
		url = "http://219.136.91.63:8200/anqingOA/xinxiguanlidetail.mobo?iswap=1&cmd=request&userName="
				+ Constants.xietongname
				+ "&userPassword="
				+ Constants.xietongpwd + "&url=" + url;
		Intent intent = new Intent(context, WapViewActivity2.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.putExtra("url", url);
		intent.putExtra("title", getString(R.string.xinxi) + "详情");
		intent.putExtra("typeid", "1");
		startActivity(intent);
	}

	@Override
	public void setHeadMethod() {
		// TODO Auto-generated method stub
		setHeadView(findViewById(R.id.headLayout), R.drawable.back_btn, "",
				getString(R.string.xinxi), 0, "", this, null);
	}

	@Override
	public void setRequestMethod() {
		// TODO Auto-generated method stub
		method = getString(R.string.info_list);
		setQueryUrl(method);
	}
}

package com.do1.aqzhdj.activity.bbs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.com.do1.component.parse.ResultObject;
import cn.com.do1.component.util.ToastUtil;

import com.do1.aqzhdj.R;
import com.do1.aqzhdj.activity.bbs.widgt.MyGallery;
import com.do1.aqzhdj.activity.parent.BaseActivity;
import com.do1.aqzhdj.util.Constants;
import com.do1.aqzhdj.util.Entryption;
import com.do1.aqzhdj.util.Listenertool;

public class SendRequestActivty extends BaseActivity{
	
	private String id;
	private String title;
	Dialog dialog;
	String content;
	
	private int[] ids = { R.id.image1, R.id.image2, R.id.image3, R.id.image4,
			R.id.image5, R.id.image6, R.id.image7, R.id.image8, R.id.image11,
			R.id.image12, R.id.image13, R.id.image14, R.id.image15,
			R.id.image16, R.id.image17, R.id.image18, R.id.image21,
			R.id.image22, R.id.image23, R.id.image24, R.id.image25,
			R.id.image26, R.id.image27, R.id.image28};
	private static int[] resourceIds = { R.drawable.a001, R.drawable.a002,
			R.drawable.a003, R.drawable.a004, R.drawable.a005, R.drawable.a006,
			R.drawable.a007, R.drawable.a008, R.drawable.a009, R.drawable.a010,
			R.drawable.a011, R.drawable.a012, R.drawable.a013, R.drawable.a014,
			R.drawable.a015, R.drawable.a016, R.drawable.a017, R.drawable.a018,
			R.drawable.a019, R.drawable.a020, R.drawable.a021, R.drawable.a022,
			R.drawable.a023, R.drawable.a024, R.drawable.a025, R.drawable.a026,
			R.drawable.a027, R.drawable.a028, R.drawable.a029, R.drawable.a030,
			R.drawable.a031, R.drawable.a032, R.drawable.a033, R.drawable.a034,
			R.drawable.a035, R.drawable.a036, R.drawable.a037, R.drawable.a038,
			R.drawable.a039, R.drawable.a040, R.drawable.a041, R.drawable.a042,
			R.drawable.a043, R.drawable.a044, R.drawable.a045, R.drawable.a046,
			R.drawable.a047, R.drawable.a048, R.drawable.a049, R.drawable.a050,
			R.drawable.a051, R.drawable.a052, R.drawable.a053, R.drawable.a054,
			R.drawable.a055, R.drawable.a056, R.drawable.a057, R.drawable.a058,
			R.drawable.a059, R.drawable.a060, R.drawable.a061, R.drawable.a062,
			R.drawable.a063, R.drawable.a064 };

	private String[] resourceStr = { "微笑", "大笑", "眨眼", "桃心", "害羞", "惊讶", "白眼",
			"疑问", "天真", "鬼脸", "囧", "悲伤", "坏笑", "板砖", "流泪", "尴尬", "鄙视", "很给力",
			"挖鼻孔", "晕", "切", "睡觉", "鼓掌", "嘘", "痛恨", "忐忑", "失望", "困惑", "担心",
			"纠结", "思考", "窃喜", "得意", "呆", "闭嘴", "汗", "吐", "惊恐", "亲亲", "胜利",
			"暴打", "赞", "吃饭", "喷血", "再见", "生病", "拥抱", "无聊", "灵感", "赞同", "愤怒",
			"抓狂", "爱心", "心碎", "菜刀", "OK", "强", "弱", "便便", "礼物", "蛋糕", "元宝", "天生",
			"恶魔"};

	private List<View> list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send_request);

		list = new ArrayList<View>();
		
		init();
	}

	private void init() {
		setHeadView(findViewById(R.id.headLayout), R.drawable.btn_back_thzhd, "",
				"回复", R.drawable.btn_head_2, "发布", this, this);
		
//		id = getIntent().getExtras().getString("id");
//		title = getIntent().getExtras().getString("title");
//		aq.id(R.id.bbsTitle).text("回复标题: "+title);
		
		int[] resourceIds = { R.id.biaoqing };
		Listenertool.bindOnCLickListener(this, this, resourceIds);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.leftImage:
			finish();
			break;
		case R.id.rightImage:
			Toast.makeText(this, "回复成功", 0).show();
			finish();
//			content = aq.id(R.id.bbsContent).getEditText().getText().toString();
//			if(content == null || "".equals(content)){
//				ToastUtil.showShortMsg(this, "回复内容不能为空");
//				return;
//			}
//			try {
//				String url = Constants.SERVER_URL +"ReplyPartyForum.aspx";
//				Map<String, Object> map = new HashMap<String, Object>();
//				map.put("user_id", constants.userInfo.getUserId());
//				map.put("forum_id",	id);
//				map.put("content", content);
//				String param = Entryption.encode(toJsonString(map));
//				doRequestPostString(1, url, param);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			break;
			
		case R.id.biaoqing:
			dialog = new Dialog(this, R.style.dialog);
			dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题
			dialog.setContentView(R.layout.send_bbs_dialog);

			MyGallery gallery = (MyGallery) dialog.findViewById(R.id.gallery);
			GridAdaper adapter = new GridAdaper(this);
			gallery.setAdapter(adapter);
			gallery.setOnItemSelectedListener(new OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> parent, View view,
						int position, long id) {
					ImageView imageicon1 = (ImageView) dialog
							.findViewById(R.id.icon_select01);
					ImageView imageicon2 = (ImageView) dialog
							.findViewById(R.id.icon_select02);
					ImageView imageicon3 = (ImageView) dialog
							.findViewById(R.id.icon_select03);
					if (position == 0) {
						imageicon3.setBackgroundResource(R.drawable.point_off);
						imageicon2.setBackgroundResource(R.drawable.point_off);
						imageicon1.setBackgroundResource(R.drawable.point_on);
					} else if (position == 1) {
						imageicon3.setBackgroundResource(R.drawable.point_off);
						imageicon2.setBackgroundResource(R.drawable.point_on);
						imageicon1.setBackgroundResource(R.drawable.point_off);
					} else if(position == 2){
						imageicon3.setBackgroundResource(R.drawable.point_on);
						imageicon2.setBackgroundResource(R.drawable.point_off);
						imageicon1.setBackgroundResource(R.drawable.point_off);
					}
				}
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					
				}
			});

			// 显示在底部
			Window window = dialog.getWindow();
			window.setGravity(Gravity.BOTTOM);
			dialog.show();
			// 横向撑满屏幕，一定要在dialog.show();方法后面
			WindowManager windowManager = getWindowManager();
			Display display = windowManager.getDefaultDisplay();
			WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
			lp.width = (int) (display.getWidth());
			dialog.getWindow().setAttributes(lp);

			TextView btText = (TextView) dialog.findViewById(R.id.quite);
			btText.setOnClickListener(this);

			break;
			
		case R.id.quite:
			dialog.dismiss();
			break;


		default:
			break;
		}
	}
	
	public String toJsonString(Map<String, Object> map){
		JSONObject json = new JSONObject(map);
		return json.toString();
	}
	
	@Override
	public void onExecuteSuccess(int requestId, ResultObject resultObject) {
		super.onExecuteSuccess(requestId, resultObject);
		ToastUtil.showShortMsg(SendRequestActivty.this, "回复成功");
		DuesBBSDetailActivity.flag = true;
		finish();
	}
	
	private class GridAdaper extends BaseAdapter {
		protected LayoutInflater mInflater;

		public GridAdaper(Context ctx) {
			mInflater = LayoutInflater.from(ctx);
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.gridview_item, null);
			}
		

			switch (position) {
			case 0:
				ImageView image;
				for (int i = 0; i < 24; i++) {
					image = (ImageView) convertView.findViewById(ids[i]);
					Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
							resourceIds[i]);
					image.setImageBitmap(zoomBitmap(bitmap, 60, 60));
					final int j = i;
					image.setOnClickListener(new android.view.View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Message msg = new Message();
							msg.arg1 = j;
							handler.sendMessage(msg);
							dialog.dismiss();
						}
					});
				}
				break;

			case 1:
				for (int i = 24; i < 48; i++) {
					image = (ImageView) convertView.findViewById(ids[i-24]);
					Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
							resourceIds[i]);
					image.setImageBitmap(zoomBitmap(bitmap, 60, 60));
					final int j = i;
					image.setOnClickListener(new android.view.View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Message msg = new Message();
							msg.arg1 = j;
							handler.sendMessage(msg);
							dialog.dismiss();
						}
					});
				}
				break;

			case 2:
				for (int i = 48; i < 64; i++) {
					image = (ImageView) convertView.findViewById(ids[i-48]);
					Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
							resourceIds[i]);
					image.setImageBitmap(zoomBitmap(bitmap, 60, 60));
					final int j = i;
					image.setOnClickListener(new android.view.View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Message msg = new Message();
							msg.arg1 = j;
							handler.sendMessage(msg);
							dialog.dismiss();
						}
					});
				}
				break;

			default:
				break;
			}
			return convertView;
		}

		public Bitmap zoomBitmap(Bitmap bitmap, int width, int height) {
			int w = bitmap.getWidth();
			int h = bitmap.getHeight();
			Matrix matrix = new Matrix();
			float scaleWidth = ((float) width / w);
			float scaleHeight = ((float) height / h);
			matrix.postScale(scaleWidth, scaleHeight);
			Bitmap newbmp = Bitmap.createBitmap(bitmap, 0, 0, w, h, matrix,
					true);
			return newbmp;
		}
	}	
	
	public Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			content =  aq.id(R.id.bbsContent).getText().toString();
//			content = content+"/"+resourceStr[msg.arg1];
			Bitmap bitmap = BitmapFactory.decodeResource(getResources(), resourceIds[msg.arg1]);
			 ImageSpan imageSpan = new ImageSpan(SendRequestActivty.this, bitmap);
			 String text = "/"+resourceStr[msg.arg1];
			 SpannableString spannableString = new SpannableString(text);
			 spannableString.setSpan(imageSpan, 0, text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

			EditText edittext = aq.id(R.id.bbsContent).getEditText();			
			edittext.append(spannableString);
		}
	};
	

}

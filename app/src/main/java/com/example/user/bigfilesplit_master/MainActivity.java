package com.example.user.bigfilesplit_master;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	
	private String SD_CARD_PATH;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SD_CARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
	}
	
	/**
	 * 拆分
	 * @param btn
	 */
	public void mDiff(View btn){		
		String path = SD_CARD_PATH +File.separatorChar+ "aaa.mp4";
		String path_pattern = SD_CARD_PATH +File.separatorChar+ "aaa_%d.mp4";
		NDKFileUtils.diff(path, path_pattern, 3);
		Log.d("jason", "拆分完毕..");
	}
	
	/**
	 * 合并
	 * @param btn
	 */
	public void mPatch(View btn){				
		String path_pattern = SD_CARD_PATH +File.separatorChar+ "aaa_%d.mp4";
		String merge_path = SD_CARD_PATH +File.separatorChar+ "aaa_merge.mp4";
		NDKFileUtils.patch(path_pattern, 3, merge_path);
		Log.d("jason", "合并完毕..");
	}
	
}

package com.race.data;

public class ResourceAnimationData {
	int duration;
	int tw;
	int th;
	String imageId;

	public ResourceAnimationData(String id, int tw, int th, int duration){
		this.imageId = id;
		this.tw = tw;
		this.th = th;
		this.duration = duration;
	}

	public final int getDuration() {
		return duration;
	}
	public final void setDuration(int duration) {
		this.duration = duration;
	}
	public final int getTw() {
		return tw;
	}
	public final void setTw(int tw) {
		this.tw = tw;
	}
	public final int getTh() {
		return th;
	}
	public final void setTh(int th) {
		this.th = th;
	}
	public final String getImageId() {
		return imageId;
	}
	public final void setImageId(String imageId) {
		this.imageId = imageId;
	}

}

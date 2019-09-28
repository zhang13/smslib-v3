package org.smslib;


/**
 * 拨打电话语音播报信息类
 */
public class OutboundTTSMessage extends OutboundMessage
{
	private static final long serialVersionUID = 1L;

	public enum CallStatuses
	{
		/**
		 * 服务异常
		 */
		ERROR,
		/**
		 * 无信号
		 */
		NO_SINGAL,
		/**
		 * 未接听
		 */
		NO_ANSWER,
		/**
		 * 挂断
		 */
		HANG_UP,
		/**
		 * 接听挂断
		 */
		ANSWER_HANG_UP,
		/**
		 * 等待语音播放完成超时
		 */
		TIME_OUT,
		/**
		 * 播放完毕
		 */
		OK;
	}
	
	private CallStatuses callStatuses;

	public OutboundTTSMessage(String phone, String content) {
		super(phone, content);
	}

	public CallStatuses getCallStatuses() {
		return callStatuses;
	}

	public void setCallStatuses(CallStatuses callStatuses) {
		this.callStatuses = callStatuses;
	}
}

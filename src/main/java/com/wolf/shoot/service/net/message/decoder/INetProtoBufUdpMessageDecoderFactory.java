package com.wolf.shoot.service.net.message.decoder;

import com.wolf.shoot.common.exception.CodecException;
import com.wolf.shoot.service.net.message.AbstractNetProtoBufMessage;
import io.netty.buffer.ByteBuf;

/**
 * Created by jiangwenping on 17/2/20.
 */
public interface INetProtoBufUdpMessageDecoderFactory {
    public  AbstractNetProtoBufMessage praseMessage(ByteBuf byteBuf) throws CodecException;
}

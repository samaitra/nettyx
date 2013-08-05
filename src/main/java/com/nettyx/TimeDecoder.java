package com.nettyx;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 05/08/13
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeDecoder extends ByteToMessageDecoder { // (1)
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) { // (2)
        if (in.readableBytes() < 4) {
            return; // (3)
        }

        //out.add(in.readBytes(4)); // (4)
        out.add(new Time(in.readInt()));
    }
}

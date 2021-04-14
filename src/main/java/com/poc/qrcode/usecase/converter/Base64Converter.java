package com.poc.qrcode.usecase.converter;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Base64Converter {
    String converteBufferedImageToBase64(BufferedImage bufferedImage) throws IOException;
}

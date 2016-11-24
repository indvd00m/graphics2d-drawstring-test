package com.indvd00m.tests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.junit.Test;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Nov-24 5:10:09 PM
 *
 */
public class TestGraphics2DdrawString {

	@Test
	public void test01() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "                          █                                                     \n";
		expected += " ███                      █      █████                                          \n";
		expected += " █  █                     █        █               █                            \n";
		expected += " █  █ ████   ██  █  █   ███  ██    █    ██  █  █  ████                          \n";
		expected += " ███  █     █  █ █  █  █  █ █  █   █   █  █  ██    █                            \n";
		expected += " █     ███  ████ █  █  █  █ █  █   █   ████  ██    █                            \n";
		expected += " █       █  █    █  █  █  █ █  █   █   █     ██    █                            \n";
		expected += " █    ████   ███ ████   ███  ██    █    ███ █  █   ███                          \n";
		expected += "                                                                                ";

		String result = drawText(80, "PseudoText");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	public void test02() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "                                                                                \n";
		expected += "  ██  ███    ███ ███   ████ ████   ███ █  █ ███    ███ █  █  █    █  █ █  █     \n";
		expected += "  ██  █  █  █    █  █  █    █     █    █  █  █       █ █ █   █    ████ ██ █     \n";
		expected += "  ██  █  █  █    █  █  █    █     █    █  █  █       █ ██    █    ████ ██ █     \n";
		expected += " █  █ ███   █    █  █  ████ ████  █ ██ ████  █       █ ██    █    ████ █ ██     \n";
		expected += " █  █ █  █  █    █  █  █    █     █  █ █  █  █       █ █ █   █    ████ █ ██     \n";
		expected += " ████ █  █  █    █  █  █    █     █  █ █  █  █       █ █ █   █    █  █ █ ██     \n";
		expected += " █  █ ████   ███ ███   ████ █      ███ █  █ ███   ████ █  █  ████ █  █ █  █     \n";
		expected += "                                                                                ";

		String result = drawText(80, "ABCDEFGHIJKLMN");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	public void test03() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "                                                                       █        \n";
		expected += "  ██  ███    ██  ███    ██ █████  █  █ █  ██   █  █  ██   █  ████      █        \n";
		expected += " █  █ █  █  █  █ █  █  █  █  █    █  █ █  ██   █  █  █ █ █      █      █        \n";
		expected += " █  █ █  █  █  █ █  █  █     █    █  █  ██ █ █ █   ██  █ █     █  ███  ███      \n";
		expected += " █  █ ███   █  █ ███    ███  █    █  █  ██ ██ ██   ██   █      █     █ █  █     \n";
		expected += " █  █ █     █  █ █ ██     █  █    █  █  ██  █ █    ██   █     █   ████ █  █     \n";
		expected += " █  █ █     █  █ █  █  █  █  █    █  █  ██  █ █   █  █  █    █    █  █ █  █     \n";
		expected += "  ██  █      ██  █   █  ██   █     ██   ██  █ █   █  █  █    ████ ████ ███      \n";
		expected += "               █                                                                ";

		String result = drawText(80, "OPQRSTUVWXYZab");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	public void test04() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "         █         ██       █      █     █  █    ███                            \n";
		expected += "         █        █         █               █      █                            \n";
		expected += "         █        █         █               █      █                            \n";
		expected += "  ███  ███   ██  ████   ███ ████  ██    ██  █  █   █   █████ ████  ██  ███      \n";
		expected += " █    █  █  █  █  █    █  █ █  █   █     █  █ █    █   █ █ █ █  █ █  █ █  █     \n";
		expected += " █    █  █  ████  █    █  █ █  █   █     █  ██     █   █ █ █ █  █ █  █ █  █     \n";
		expected += " █    █  █  █     █    █  █ █  █   █     █  █ █    █   █ █ █ █  █ █  █ █  █     \n";
		expected += "  ███  ███   ███  █     ███ █  █ █████   █  █  █    ██ █ █ █ █  █  ██  ███      \n";
		expected += "                          █              █                             █        ";

		String result = drawText(80, "cdefghijklmnop");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	public void test05() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "                                                                                \n";
		expected += "                                                        ██    ██   ██    █      \n";
		expected += "                  █                                      █   █  █ █  █   █      \n";
		expected += "  ███  ███  ████ ████  █  █ █  █ █   █ █  █ █  █  ████   █      █    █  ██      \n";
		expected += " █  █  █    █     █    █  █ █  █ █ █ █  ██  █  █    █    █     ██  ██   ██      \n";
		expected += " █  █  █     ███  █    █  █  ██   █ █   ██   ██    ██    █    ██     █ █ █      \n";
		expected += " █  █  █       █  █    █  █  ██   █ █   ██   ██    █     █   ██      █ ████     \n";
		expected += "  ███  █    ████  ███  ████  ██   █ █  █  █  █    ████  ███  ████ ███    █      \n";
		expected += "    █                                        █                                  ";

		String result = drawText(80, "qrstuvwxyz1234");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	public void test06() {
		String expected = "";
		expected += "                                                                                \n";
		expected += "                                                                                \n";
		expected += " ████  ███  ████  ██    ██   ██    █         ██     █ ███     █    ████ █ █     \n";
		expected += " █    ██       █ █  █  █  █ █  █   █    ██  █ █    ████ █   ██ █   █   ███      \n";
		expected += " █    █       █  █  █  █  █ █  █   █   █  ██████  █ █ ███ █        █   ███      \n";
		expected += " ███  ████    █   ██   ████ █ ██   █   █ ██ █ █   ███   ██         ██ █ █ █     \n";
		expected += "    █ █  █    █  █  █     █ █  █   █   █ ███████    ███████       █ ██          \n";
		expected += "    █ █  █   ██  █  █    ██ █  █       █ ██ ██      █ █ █ █       █ █           \n";
		expected += " ███   ██    █    ██   ███   ██    █   ██  █ █    ████  ███        ███          \n";
		expected += "                                        ██          █                           ";

		String result = drawText(80, "567890!@#$%^&*");

		System.out.println("Expected: ");
		System.out.println(expected);
		System.out.println("Actual:");
		System.out.println(result);

		assertEquals(expected, result);
	}

	String drawText(int width, String text) {
		int x = 0;
		int y = 9;
		int height = 10;
		float fontSizeInPixels = 9f;

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics = image.createGraphics();
		graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);

		Font font = getFont().deriveFont(fontSizeInPixels);

		Color fontColor = Color.BLACK;
		Color backgroundColor = Color.WHITE;

		graphics.setFont(font);
		graphics.setColor(backgroundColor);
		graphics.fillRect(0, 0, width, height);
		graphics.setColor(fontColor);
		graphics.drawString(text, x, y);

		// writeImageToPNG(image, "/tmp/test.png");

		String result = imageToString(image, backgroundColor);
		return result;
	}

	String imageToString(BufferedImage image, Color backgroundColor) {
		StringBuilder sb = new StringBuilder();

		int width = image.getWidth();
		int height = image.getHeight();
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int rgb = image.getRGB(x, y);
				Color color = new Color(rgb);
				if (backgroundColor.equals(color)) {
					sb.append(' ');
				} else {
					sb.append('█');
				}
			}
			sb.append('\n');
		}
		if (height > 0)
			sb.setLength(sb.length() - 1);

		return sb.toString();
	}

	Font getFont() {
		InputStream is = null;
		try {
			is = getClass().getResourceAsStream("/fonts/DejaVuSansMono/DejaVuSansMono.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, is);
			return font;
		} catch (FontFormatException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	void writeImageToPNG(BufferedImage image, String path) {
		try {
			ImageIO.write(image, "png", new File(path));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}

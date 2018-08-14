package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by n.yarceva on 14.08.2018.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {

/*        try {*/
        if (ImageTypes.JPG.equals(imageTypes)) {
            return new JpgReader();
        } else if (ImageTypes.BMP.equals(imageTypes)) {
            return new BmpReader();
        } else if (ImageTypes.PNG.equals(imageTypes)) {
            return new PngReader();
        } else
        throw new IllegalArgumentException("Неизвестный тип картинки");
/*        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }*/

        //return null;
    }
}

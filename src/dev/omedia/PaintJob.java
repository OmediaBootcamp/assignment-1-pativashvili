package dev.omedia;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        System.out.println(width + " " + height + " " + areaPerBucket + " " +  extraBuckets);
        if (width <= 0 || height <= 0 || extraBuckets < 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(1, area, areaPerBucket, 0);
    }
}

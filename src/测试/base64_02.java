package 测试;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

public class base64_02 {

    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = null;
        try {
            Base64.Decoder decoder = Base64.getDecoder();

            byte[] bytes = decoder.decode("iVBORw0KGgoAAAANSUhEUgAAAB4AAAAwCAIAAACJ9F2zAAABSWlDQ1BJQ0MgUHJvZmlsZQAAKJFjYGASSSwoyGFhYGDIzSspCnJ3UoiIjFJgf8bAysDIwMdgwGCemFxc4BgQ4ANUwgCjUcG3a0C1QHBZF2RWbljjow/y+/7su3rlzK8lMz5iqkcBXCmpxclA+g8QpycXFJUwMDCmANnK5SUFIHYHkC1SBHQUkD0HxE6HsDeA2EkQ9hGwmpAgZyD7BpAtkJyRCDSD8QWQrZOEJJ6OxIbaCwK8YRFGJoaWuibeuh4uBNxLMihJrSgB0c75BZVFmekZJQqOwFBKVfDMS9bTUTAyMDJiYACFOUT150BwWDKKnUGI5S9iYLD4ysDAPAEhljSTgWF7KwODxC2EmMoCBgb+FgaGbecLEosS4Q5g/MZSnGZsBGHzODEwsN77//+zGgMD+2QGhr8T/v//vej//7+LgebfYWA4kAcABCFka4aiBMAAAABsZVhJZk1NACoAAAAIAAQBGgAFAAAAAQAAAD4BGwAFAAAAAQAAAEYBKAADAAAAAQACAACHaQAEAAAAAQAAAE4AAAAAAAAAkAAAAAEAAACQAAAAAQACoAIABAAAAAEAAAAeoAMABAAAAAEAAAAwAAAAAN6aT2YAAAAJcEhZcwAAFiUAABYlAUlSJPAAAAJfSURBVFgJ7ZfPj9JAFMcZaQVZfiyISyCRReImxWg28cfBePJm9m5M9KIn7yb7f3j15I94XF0Tj548eTBGLyZq3Ba3EAlZ2WzaQgn94RdmM9RRi0zCBSENee+17zNvvp15DEQ5ezEym8+R2WCH1AWa03YhyEIQTgHOXayQuRBE4mYR4laTycrSEh4wBs7bzg8Y57O59ezySjzuen7L7r1ut/VulxGmQF/Jn7hVqSDzi2FolrlZq60vZxkIxs3VyrOG/lBVPd+HK7j47ikKxx2yCLl+sryp1Oh4IuhCPA4pkN/u2+86HVyGM6A4fF8tFC7n8zCmEIQlZ2S573mPVHW7odPgsWj07um1a8UidTeKpTd7eyJVI/9pXWNcuD3Xvf/508eDA4pW0mkYImiU/LLZpJTg96vWd+qmZDkRlUTQrV7Pdt0glNp1y2LBpCyERtUMETS48USqDuJC7P8HTf6iAon8ckdEkKT0542Wksdx3/dF0NjouH4v/UwmQ4NoTobjiKDRhm6fqnJo7P6NUokG27aNhTieAvdoiIueiR6UluUndW3HNDH3S7njd6rVldjhVD7s7yNdBK1ZVjmRuJDL4cIwXsSXyHj2qPf5qG2NQyFlcrf6nrulH/Y8iBPkYqQHO1+/jXa8SNXRCHmsqZbj3FgtpySZDbzbtfATg3ZKIyJoQobrd0vffdFsnMtk8rHYwPPBVU2TDQNDBM3yHc97P3pjLBI0RLQO5ofYc492R6cLKECPGSFS0Fvk3//tYp1lY0eRhk2BrTwRPcUKwWEjeN6YiJ771zhRAe6BGQryE5l2zxoO5o8DAAAAAElFTkSuQmCC");

            outputStream = new FileOutputStream("/Users/ppsn/Documents/Java-learning/src/测试/img");

            outputStream.write(bytes);
            System.out.println(Arrays.toString(bytes));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            outputStream.close();
        }

    }
}

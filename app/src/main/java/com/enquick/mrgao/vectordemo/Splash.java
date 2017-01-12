package com.enquick.mrgao.vectordemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mr.gao on 2017/1/3.
 */

public class Splash extends View {

   // private final Path path;
    private final Paint paint;

    public Splash(Context context, AttributeSet attrs) {
        super(context, attrs);
        //path = new SvgPathParser().parsePath();
       // PathMeasure pathMeasure = new PathMeasure(path, true);

        paint = new Paint();

        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
     //   canvas.drawPath(path,paint);
    }
}

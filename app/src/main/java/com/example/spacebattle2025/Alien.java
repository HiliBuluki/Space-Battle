package com.example.spacebattle2025;

import android.graphics.Bitmap;

import java.util.Random;

public class Alien extends Sprite {
    public float x;
    public  float y;
    int life;//משתנה שלם המייצג את כמות החיים של החייזר. ערכו נקבע בצורה רנדומלית בין 1 ל-6.
    Random bb = new Random();//מציג את ערך החיים של החייזר באופן רנדומלי
    private float canvasWidth;//מייצגים את גבולות המסך
    public Bitmap bitmap;// תמונת החייזר שמוצגת במשחק
    private float canvasHeight;

    //  מקבל את המיקום, התמונה של החייזר, ומאתחל חיים רנדומליים
    public Alien(float x, float y, Bitmap bitmap)
    {
        super(x, y, 20, 20); // קריאה לקונסטרקטור של Sprite עם מיקום וגודל (20x20)
        this.bitmap = bitmap; // שמירת התמונה
        life = (bb.nextInt(6) + 1); // אתחול החיים לערך רנדומלי בין 1 ל-6
    }
    public Bitmap getBitmap() {//מחזירה את התמונה של החייזר
        return bitmap;
    }
    public int getLife() {// מחזירה את כמות החיים של החייזר
        return life;
    }
    public void setLife(int life) {//מפחיתה מכמות החיים של החייזר 1
        this.life = life-1;
    }

    }
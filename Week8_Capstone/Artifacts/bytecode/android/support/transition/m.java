class android.support.transition.m<T> extends android.util.Property<T, java.lang.Float> {
  android.support.transition.m(android.util.Property<T, android.graphics.PointF>, android.graphics.Path);
    Code:
       0: aload_0
       1: ldc           #21                 // class java/lang/Float
       3: aload_1
       4: invokevirtual #25                 // Method android/util/Property.getName:()Ljava/lang/String;
       7: invokespecial #28                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
      10: aload_0
      11: iconst_2
      12: newarray       float
      14: putfield      #30                 // Field d:[F
      17: aload_0
      18: new           #32                 // class android/graphics/PointF
      21: dup
      22: invokespecial #35                 // Method android/graphics/PointF."<init>":()V
      25: putfield      #37                 // Field e:Landroid/graphics/PointF;
      28: aload_0
      29: aload_1
      30: putfield      #39                 // Field a:Landroid/util/Property;
      33: aload_0
      34: new           #41                 // class android/graphics/PathMeasure
      37: dup
      38: aload_2
      39: iconst_0
      40: invokespecial #44                 // Method android/graphics/PathMeasure."<init>":(Landroid/graphics/Path;Z)V
      43: putfield      #46                 // Field b:Landroid/graphics/PathMeasure;
      46: aload_0
      47: aload_0
      48: getfield      #46                 // Field b:Landroid/graphics/PathMeasure;
      51: invokevirtual #50                 // Method android/graphics/PathMeasure.getLength:()F
      54: putfield      #52                 // Field c:F
      57: return

  public java.lang.Float a(T);
    Code:
       0: aload_0
       1: getfield      #58                 // Field f:F
       4: invokestatic  #62                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
       7: areturn

  public void a(T, java.lang.Float);
    Code:
       0: aload_0
       1: aload_2
       2: invokevirtual #67                 // Method java/lang/Float.floatValue:()F
       5: putfield      #58                 // Field f:F
       8: aload_0
       9: getfield      #46                 // Field b:Landroid/graphics/PathMeasure;
      12: aload_0
      13: getfield      #52                 // Field c:F
      16: aload_2
      17: invokevirtual #67                 // Method java/lang/Float.floatValue:()F
      20: fmul
      21: aload_0
      22: getfield      #30                 // Field d:[F
      25: aconst_null
      26: invokevirtual #71                 // Method android/graphics/PathMeasure.getPosTan:(F[F[F)Z
      29: pop
      30: aload_0
      31: getfield      #37                 // Field e:Landroid/graphics/PointF;
      34: aload_0
      35: getfield      #30                 // Field d:[F
      38: iconst_0
      39: faload
      40: putfield      #74                 // Field android/graphics/PointF.x:F
      43: aload_0
      44: getfield      #37                 // Field e:Landroid/graphics/PointF;
      47: aload_0
      48: getfield      #30                 // Field d:[F
      51: iconst_1
      52: faload
      53: putfield      #77                 // Field android/graphics/PointF.y:F
      56: aload_0
      57: getfield      #39                 // Field a:Landroid/util/Property;
      60: aload_1
      61: aload_0
      62: getfield      #37                 // Field e:Landroid/graphics/PointF;
      65: invokevirtual #81                 // Method android/util/Property.set:(Ljava/lang/Object;Ljava/lang/Object;)V
      68: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #86                 // Method a:(Ljava/lang/Object;)Ljava/lang/Float;
       5: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #21                 // class java/lang/Float
       6: invokevirtual #88                 // Method a:(Ljava/lang/Object;Ljava/lang/Float;)V
       9: return
}

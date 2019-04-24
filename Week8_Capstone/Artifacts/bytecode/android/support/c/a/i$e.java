class android.support.c.a.i$e {
  final android.support.c.a.i$c a;

  float b;

  float c;

  float d;

  float e;

  int f;

  java.lang.String g;

  final android.support.v4.g.a<java.lang.String, java.lang.Object> h;

  static {};
    Code:
       0: new           #36                 // class android/graphics/Matrix
       3: dup
       4: invokespecial #39                 // Method android/graphics/Matrix."<init>":()V
       7: putstatic     #41                 // Field k:Landroid/graphics/Matrix;
      10: return

  public android.support.c.a.i$e();
    Code:
       0: aload_0
       1: invokespecial #43                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #36                 // class android/graphics/Matrix
       8: dup
       9: invokespecial #39                 // Method android/graphics/Matrix."<init>":()V
      12: putfield      #45                 // Field l:Landroid/graphics/Matrix;
      15: aload_0
      16: fconst_0
      17: putfield      #47                 // Field b:F
      20: aload_0
      21: fconst_0
      22: putfield      #49                 // Field c:F
      25: aload_0
      26: fconst_0
      27: putfield      #51                 // Field d:F
      30: aload_0
      31: fconst_0
      32: putfield      #53                 // Field e:F
      35: aload_0
      36: sipush        255
      39: putfield      #55                 // Field f:I
      42: aload_0
      43: aconst_null
      44: putfield      #57                 // Field g:Ljava/lang/String;
      47: aload_0
      48: new           #59                 // class android/support/v4/g/a
      51: dup
      52: invokespecial #60                 // Method android/support/v4/g/a."<init>":()V
      55: putfield      #62                 // Field h:Landroid/support/v4/g/a;
      58: aload_0
      59: new           #64                 // class android/support/c/a/i$c
      62: dup
      63: invokespecial #65                 // Method android/support/c/a/i$c."<init>":()V
      66: putfield      #67                 // Field a:Landroid/support/c/a/i$c;
      69: aload_0
      70: new           #69                 // class android/graphics/Path
      73: dup
      74: invokespecial #70                 // Method android/graphics/Path."<init>":()V
      77: putfield      #72                 // Field i:Landroid/graphics/Path;
      80: aload_0
      81: new           #69                 // class android/graphics/Path
      84: dup
      85: invokespecial #70                 // Method android/graphics/Path."<init>":()V
      88: putfield      #74                 // Field j:Landroid/graphics/Path;
      91: return

  public android.support.c.a.i$e(android.support.c.a.i$e);
    Code:
       0: aload_0
       1: invokespecial #43                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #36                 // class android/graphics/Matrix
       8: dup
       9: invokespecial #39                 // Method android/graphics/Matrix."<init>":()V
      12: putfield      #45                 // Field l:Landroid/graphics/Matrix;
      15: aload_0
      16: fconst_0
      17: putfield      #47                 // Field b:F
      20: aload_0
      21: fconst_0
      22: putfield      #49                 // Field c:F
      25: aload_0
      26: fconst_0
      27: putfield      #51                 // Field d:F
      30: aload_0
      31: fconst_0
      32: putfield      #53                 // Field e:F
      35: aload_0
      36: sipush        255
      39: putfield      #55                 // Field f:I
      42: aload_0
      43: aconst_null
      44: putfield      #57                 // Field g:Ljava/lang/String;
      47: aload_0
      48: new           #59                 // class android/support/v4/g/a
      51: dup
      52: invokespecial #60                 // Method android/support/v4/g/a."<init>":()V
      55: putfield      #62                 // Field h:Landroid/support/v4/g/a;
      58: aload_0
      59: new           #64                 // class android/support/c/a/i$c
      62: dup
      63: aload_1
      64: getfield      #67                 // Field a:Landroid/support/c/a/i$c;
      67: aload_0
      68: getfield      #62                 // Field h:Landroid/support/v4/g/a;
      71: invokespecial #78                 // Method android/support/c/a/i$c."<init>":(Landroid/support/c/a/i$c;Landroid/support/v4/g/a;)V
      74: putfield      #67                 // Field a:Landroid/support/c/a/i$c;
      77: aload_0
      78: new           #69                 // class android/graphics/Path
      81: dup
      82: aload_1
      83: getfield      #72                 // Field i:Landroid/graphics/Path;
      86: invokespecial #81                 // Method android/graphics/Path."<init>":(Landroid/graphics/Path;)V
      89: putfield      #72                 // Field i:Landroid/graphics/Path;
      92: aload_0
      93: new           #69                 // class android/graphics/Path
      96: dup
      97: aload_1
      98: getfield      #74                 // Field j:Landroid/graphics/Path;
     101: invokespecial #81                 // Method android/graphics/Path."<init>":(Landroid/graphics/Path;)V
     104: putfield      #74                 // Field j:Landroid/graphics/Path;
     107: aload_0
     108: aload_1
     109: getfield      #47                 // Field b:F
     112: putfield      #47                 // Field b:F
     115: aload_0
     116: aload_1
     117: getfield      #49                 // Field c:F
     120: putfield      #49                 // Field c:F
     123: aload_0
     124: aload_1
     125: getfield      #51                 // Field d:F
     128: putfield      #51                 // Field d:F
     131: aload_0
     132: aload_1
     133: getfield      #53                 // Field e:F
     136: putfield      #53                 // Field e:F
     139: aload_0
     140: aload_1
     141: getfield      #83                 // Field p:I
     144: putfield      #83                 // Field p:I
     147: aload_0
     148: aload_1
     149: getfield      #55                 // Field f:I
     152: putfield      #55                 // Field f:I
     155: aload_0
     156: aload_1
     157: getfield      #57                 // Field g:Ljava/lang/String;
     160: putfield      #57                 // Field g:Ljava/lang/String;
     163: aload_1
     164: getfield      #57                 // Field g:Ljava/lang/String;
     167: ifnull        183
     170: aload_0
     171: getfield      #62                 // Field h:Landroid/support/v4/g/a;
     174: aload_1
     175: getfield      #57                 // Field g:Ljava/lang/String;
     178: aload_0
     179: invokevirtual #87                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     182: pop
     183: return

  static android.graphics.Paint a(android.support.c.a.i$e);
    Code:
       0: aload_0
       1: getfield      #112                // Field n:Landroid/graphics/Paint;
       4: areturn

  static android.graphics.Paint a(android.support.c.a.i$e, android.graphics.Paint);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #112                // Field n:Landroid/graphics/Paint;
       5: aload_1
       6: areturn

  static android.graphics.Paint b(android.support.c.a.i$e);
    Code:
       0: aload_0
       1: getfield      #264                // Field m:Landroid/graphics/Paint;
       4: areturn

  static android.graphics.Paint b(android.support.c.a.i$e, android.graphics.Paint);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #264                // Field m:Landroid/graphics/Paint;
       5: aload_1
       6: areturn

  public void a(android.graphics.Canvas, int, int, android.graphics.ColorFilter);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #67                 // Field a:Landroid/support/c/a/i$c;
       5: getstatic     #41                 // Field k:Landroid/graphics/Matrix;
       8: aload_1
       9: iload_2
      10: iload_3
      11: aload         4
      13: invokespecial #147                // Method a:(Landroid/support/c/a/i$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
      16: return

  public float getAlpha();
    Code:
       0: aload_0
       1: invokevirtual #297                // Method getRootAlpha:()I
       4: i2f
       5: ldc_w         #298                // float 255.0f
       8: fdiv
       9: freturn

  public int getRootAlpha();
    Code:
       0: aload_0
       1: getfield      #55                 // Field f:I
       4: ireturn

  public void setAlpha(float);
    Code:
       0: aload_0
       1: fload_1
       2: ldc_w         #298                // float 255.0f
       5: fmul
       6: f2i
       7: invokevirtual #302                // Method setRootAlpha:(I)V
      10: return

  public void setRootAlpha(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #55                 // Field f:I
       5: return
}

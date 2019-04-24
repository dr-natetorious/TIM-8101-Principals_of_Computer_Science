class android.support.c.a.i$b extends android.support.c.a.i$d {
  int a;

  float b;

  int c;

  float d;

  int e;

  float f;

  float g;

  float h;

  float i;

  android.graphics.Paint$Cap j;

  android.graphics.Paint$Join k;

  float l;

  public android.support.c.a.i$b();
    Code:
       0: aload_0
       1: invokespecial #28                 // Method android/support/c/a/i$d."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #30                 // Field a:I
       9: aload_0
      10: fconst_0
      11: putfield      #32                 // Field b:F
      14: aload_0
      15: iconst_0
      16: putfield      #34                 // Field c:I
      19: aload_0
      20: fconst_1
      21: putfield      #36                 // Field d:F
      24: aload_0
      25: iconst_0
      26: putfield      #38                 // Field e:I
      29: aload_0
      30: fconst_1
      31: putfield      #40                 // Field f:F
      34: aload_0
      35: fconst_0
      36: putfield      #42                 // Field g:F
      39: aload_0
      40: fconst_1
      41: putfield      #44                 // Field h:F
      44: aload_0
      45: fconst_0
      46: putfield      #46                 // Field i:F
      49: aload_0
      50: getstatic     #51                 // Field android/graphics/Paint$Cap.BUTT:Landroid/graphics/Paint$Cap;
      53: putfield      #53                 // Field j:Landroid/graphics/Paint$Cap;
      56: aload_0
      57: getstatic     #58                 // Field android/graphics/Paint$Join.MITER:Landroid/graphics/Paint$Join;
      60: putfield      #60                 // Field k:Landroid/graphics/Paint$Join;
      63: aload_0
      64: ldc           #61                 // float 4.0f
      66: putfield      #63                 // Field l:F
      69: return

  public android.support.c.a.i$b(android.support.c.a.i$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #68                 // Method android/support/c/a/i$d."<init>":(Landroid/support/c/a/i$d;)V
       5: aload_0
       6: iconst_0
       7: putfield      #30                 // Field a:I
      10: aload_0
      11: fconst_0
      12: putfield      #32                 // Field b:F
      15: aload_0
      16: iconst_0
      17: putfield      #34                 // Field c:I
      20: aload_0
      21: fconst_1
      22: putfield      #36                 // Field d:F
      25: aload_0
      26: iconst_0
      27: putfield      #38                 // Field e:I
      30: aload_0
      31: fconst_1
      32: putfield      #40                 // Field f:F
      35: aload_0
      36: fconst_0
      37: putfield      #42                 // Field g:F
      40: aload_0
      41: fconst_1
      42: putfield      #44                 // Field h:F
      45: aload_0
      46: fconst_0
      47: putfield      #46                 // Field i:F
      50: aload_0
      51: getstatic     #51                 // Field android/graphics/Paint$Cap.BUTT:Landroid/graphics/Paint$Cap;
      54: putfield      #53                 // Field j:Landroid/graphics/Paint$Cap;
      57: aload_0
      58: getstatic     #58                 // Field android/graphics/Paint$Join.MITER:Landroid/graphics/Paint$Join;
      61: putfield      #60                 // Field k:Landroid/graphics/Paint$Join;
      64: aload_0
      65: ldc           #61                 // float 4.0f
      67: putfield      #63                 // Field l:F
      70: aload_0
      71: aload_1
      72: getfield      #70                 // Field p:[I
      75: putfield      #70                 // Field p:[I
      78: aload_0
      79: aload_1
      80: getfield      #30                 // Field a:I
      83: putfield      #30                 // Field a:I
      86: aload_0
      87: aload_1
      88: getfield      #32                 // Field b:F
      91: putfield      #32                 // Field b:F
      94: aload_0
      95: aload_1
      96: getfield      #36                 // Field d:F
      99: putfield      #36                 // Field d:F
     102: aload_0
     103: aload_1
     104: getfield      #34                 // Field c:I
     107: putfield      #34                 // Field c:I
     110: aload_0
     111: aload_1
     112: getfield      #38                 // Field e:I
     115: putfield      #38                 // Field e:I
     118: aload_0
     119: aload_1
     120: getfield      #40                 // Field f:F
     123: putfield      #40                 // Field f:F
     126: aload_0
     127: aload_1
     128: getfield      #42                 // Field g:F
     131: putfield      #42                 // Field g:F
     134: aload_0
     135: aload_1
     136: getfield      #44                 // Field h:F
     139: putfield      #44                 // Field h:F
     142: aload_0
     143: aload_1
     144: getfield      #46                 // Field i:F
     147: putfield      #46                 // Field i:F
     150: aload_0
     151: aload_1
     152: getfield      #53                 // Field j:Landroid/graphics/Paint$Cap;
     155: putfield      #53                 // Field j:Landroid/graphics/Paint$Cap;
     158: aload_0
     159: aload_1
     160: getfield      #60                 // Field k:Landroid/graphics/Paint$Join;
     163: putfield      #60                 // Field k:Landroid/graphics/Paint$Join;
     166: aload_0
     167: aload_1
     168: getfield      #63                 // Field l:F
     171: putfield      #63                 // Field l:F
     174: return

  public void a(android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser);
    Code:
       0: aload_1
       1: aload_3
       2: aload_2
       3: getstatic     #151                // Field android/support/c/a/a.c:[I
       6: invokestatic  #154                // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
       9: astore_1
      10: aload_0
      11: aload_1
      12: aload         4
      14: invokespecial #156                // Method a:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
      17: aload_1
      18: invokevirtual #159                // Method android/content/res/TypedArray.recycle:()V
      21: return

  float getFillAlpha();
    Code:
       0: aload_0
       1: getfield      #40                 // Field f:F
       4: freturn

  int getFillColor();
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:I
       4: ireturn

  float getStrokeAlpha();
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:F
       4: freturn

  int getStrokeColor();
    Code:
       0: aload_0
       1: getfield      #30                 // Field a:I
       4: ireturn

  float getStrokeWidth();
    Code:
       0: aload_0
       1: getfield      #32                 // Field b:F
       4: freturn

  float getTrimPathEnd();
    Code:
       0: aload_0
       1: getfield      #44                 // Field h:F
       4: freturn

  float getTrimPathOffset();
    Code:
       0: aload_0
       1: getfield      #46                 // Field i:F
       4: freturn

  float getTrimPathStart();
    Code:
       0: aload_0
       1: getfield      #42                 // Field g:F
       4: freturn

  void setFillAlpha(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #40                 // Field f:F
       5: return

  void setFillColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #34                 // Field c:I
       5: return

  void setStrokeAlpha(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #36                 // Field d:F
       5: return

  void setStrokeColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #30                 // Field a:I
       5: return

  void setStrokeWidth(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #32                 // Field b:F
       5: return

  void setTrimPathEnd(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #44                 // Field h:F
       5: return

  void setTrimPathOffset(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #46                 // Field i:F
       5: return

  void setTrimPathStart(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #42                 // Field g:F
       5: return
}

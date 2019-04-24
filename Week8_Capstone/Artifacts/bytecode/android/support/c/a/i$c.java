class android.support.c.a.i$c {
  final java.util.ArrayList<java.lang.Object> a;

  float b;

  int c;

  public android.support.c.a.i$c();
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #32                 // class android/graphics/Matrix
       8: dup
       9: invokespecial #33                 // Method android/graphics/Matrix."<init>":()V
      12: putfield      #35                 // Field d:Landroid/graphics/Matrix;
      15: aload_0
      16: new           #37                 // class java/util/ArrayList
      19: dup
      20: invokespecial #38                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #40                 // Field a:Ljava/util/ArrayList;
      26: aload_0
      27: fconst_0
      28: putfield      #42                 // Field b:F
      31: aload_0
      32: fconst_0
      33: putfield      #44                 // Field e:F
      36: aload_0
      37: fconst_0
      38: putfield      #46                 // Field f:F
      41: aload_0
      42: fconst_1
      43: putfield      #48                 // Field g:F
      46: aload_0
      47: fconst_1
      48: putfield      #50                 // Field h:F
      51: aload_0
      52: fconst_0
      53: putfield      #52                 // Field i:F
      56: aload_0
      57: fconst_0
      58: putfield      #54                 // Field j:F
      61: aload_0
      62: new           #32                 // class android/graphics/Matrix
      65: dup
      66: invokespecial #33                 // Method android/graphics/Matrix."<init>":()V
      69: putfield      #56                 // Field k:Landroid/graphics/Matrix;
      72: aload_0
      73: aconst_null
      74: putfield      #58                 // Field m:Ljava/lang/String;
      77: return

  public android.support.c.a.i$c(android.support.c.a.i$c, android.support.v4.g.a<java.lang.String, java.lang.Object>);
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #32                 // class android/graphics/Matrix
       8: dup
       9: invokespecial #33                 // Method android/graphics/Matrix."<init>":()V
      12: putfield      #35                 // Field d:Landroid/graphics/Matrix;
      15: aload_0
      16: new           #37                 // class java/util/ArrayList
      19: dup
      20: invokespecial #38                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #40                 // Field a:Ljava/util/ArrayList;
      26: aload_0
      27: fconst_0
      28: putfield      #42                 // Field b:F
      31: aload_0
      32: fconst_0
      33: putfield      #44                 // Field e:F
      36: aload_0
      37: fconst_0
      38: putfield      #46                 // Field f:F
      41: aload_0
      42: fconst_1
      43: putfield      #48                 // Field g:F
      46: aload_0
      47: fconst_1
      48: putfield      #50                 // Field h:F
      51: aload_0
      52: fconst_0
      53: putfield      #52                 // Field i:F
      56: aload_0
      57: fconst_0
      58: putfield      #54                 // Field j:F
      61: aload_0
      62: new           #32                 // class android/graphics/Matrix
      65: dup
      66: invokespecial #33                 // Method android/graphics/Matrix."<init>":()V
      69: putfield      #56                 // Field k:Landroid/graphics/Matrix;
      72: aload_0
      73: aconst_null
      74: putfield      #58                 // Field m:Ljava/lang/String;
      77: aload_0
      78: aload_1
      79: getfield      #42                 // Field b:F
      82: putfield      #42                 // Field b:F
      85: aload_0
      86: aload_1
      87: getfield      #44                 // Field e:F
      90: putfield      #44                 // Field e:F
      93: aload_0
      94: aload_1
      95: getfield      #46                 // Field f:F
      98: putfield      #46                 // Field f:F
     101: aload_0
     102: aload_1
     103: getfield      #48                 // Field g:F
     106: putfield      #48                 // Field g:F
     109: aload_0
     110: aload_1
     111: getfield      #50                 // Field h:F
     114: putfield      #50                 // Field h:F
     117: aload_0
     118: aload_1
     119: getfield      #52                 // Field i:F
     122: putfield      #52                 // Field i:F
     125: aload_0
     126: aload_1
     127: getfield      #54                 // Field j:F
     130: putfield      #54                 // Field j:F
     133: aload_0
     134: aload_1
     135: getfield      #62                 // Field l:[I
     138: putfield      #62                 // Field l:[I
     141: aload_0
     142: aload_1
     143: getfield      #58                 // Field m:Ljava/lang/String;
     146: putfield      #58                 // Field m:Ljava/lang/String;
     149: aload_0
     150: aload_1
     151: getfield      #64                 // Field c:I
     154: putfield      #64                 // Field c:I
     157: aload_0
     158: getfield      #58                 // Field m:Ljava/lang/String;
     161: ifnull        174
     164: aload_2
     165: aload_0
     166: getfield      #58                 // Field m:Ljava/lang/String;
     169: aload_0
     170: invokevirtual #70                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     173: pop
     174: aload_0
     175: getfield      #56                 // Field k:Landroid/graphics/Matrix;
     178: aload_1
     179: getfield      #56                 // Field k:Landroid/graphics/Matrix;
     182: invokevirtual #74                 // Method android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
     185: aload_1
     186: getfield      #40                 // Field a:Ljava/util/ArrayList;
     189: astore        4
     191: iconst_0
     192: istore_3
     193: iload_3
     194: aload         4
     196: invokevirtual #78                 // Method java/util/ArrayList.size:()I
     199: if_icmpge     325
     202: aload         4
     204: iload_3
     205: invokevirtual #82                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     208: astore_1
     209: aload_1
     210: instanceof    #2                  // class android/support/c/a/i$c
     213: ifeq          241
     216: aload_1
     217: checkcast     #2                  // class android/support/c/a/i$c
     220: astore_1
     221: aload_0
     222: getfield      #40                 // Field a:Ljava/util/ArrayList;
     225: new           #2                  // class android/support/c/a/i$c
     228: dup
     229: aload_1
     230: aload_2
     231: invokespecial #84                 // Method "<init>":(Landroid/support/c/a/i$c;Landroid/support/v4/g/a;)V
     234: invokevirtual #88                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     237: pop
     238: goto          308
     241: aload_1
     242: instanceof    #90                 // class android/support/c/a/i$b
     245: ifeq          263
     248: new           #90                 // class android/support/c/a/i$b
     251: dup
     252: aload_1
     253: checkcast     #90                 // class android/support/c/a/i$b
     256: invokespecial #93                 // Method android/support/c/a/i$b."<init>":(Landroid/support/c/a/i$b;)V
     259: astore_1
     260: goto          282
     263: aload_1
     264: instanceof    #95                 // class android/support/c/a/i$a
     267: ifeq          315
     270: new           #95                 // class android/support/c/a/i$a
     273: dup
     274: aload_1
     275: checkcast     #95                 // class android/support/c/a/i$a
     278: invokespecial #98                 // Method android/support/c/a/i$a."<init>":(Landroid/support/c/a/i$a;)V
     281: astore_1
     282: aload_0
     283: getfield      #40                 // Field a:Ljava/util/ArrayList;
     286: aload_1
     287: invokevirtual #88                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     290: pop
     291: aload_1
     292: getfield      #103                // Field android/support/c/a/i$d.n:Ljava/lang/String;
     295: ifnull        308
     298: aload_2
     299: aload_1
     300: getfield      #103                // Field android/support/c/a/i$d.n:Ljava/lang/String;
     303: aload_1
     304: invokevirtual #70                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     307: pop
     308: iload_3
     309: iconst_1
     310: iadd
     311: istore_3
     312: goto          193
     315: new           #105                // class java/lang/IllegalStateException
     318: dup
     319: ldc           #107                // String Unknown object in the tree!
     321: invokespecial #110                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     324: athrow
     325: return

  static android.graphics.Matrix a(android.support.c.a.i$c);
    Code:
       0: aload_0
       1: getfield      #35                 // Field d:Landroid/graphics/Matrix;
       4: areturn

  static android.graphics.Matrix b(android.support.c.a.i$c);
    Code:
       0: aload_0
       1: getfield      #56                 // Field k:Landroid/graphics/Matrix;
       4: areturn

  public void a(android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser);
    Code:
       0: aload_1
       1: aload_3
       2: aload_2
       3: getstatic     #160                // Field android/support/c/a/a.b:[I
       6: invokestatic  #163                // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
       9: astore_1
      10: aload_0
      11: aload_1
      12: aload         4
      14: invokespecial #165                // Method a:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
      17: aload_1
      18: invokevirtual #168                // Method android/content/res/TypedArray.recycle:()V
      21: return

  public java.lang.String getGroupName();
    Code:
       0: aload_0
       1: getfield      #58                 // Field m:Ljava/lang/String;
       4: areturn

  public android.graphics.Matrix getLocalMatrix();
    Code:
       0: aload_0
       1: getfield      #56                 // Field k:Landroid/graphics/Matrix;
       4: areturn

  public float getPivotX();
    Code:
       0: aload_0
       1: getfield      #44                 // Field e:F
       4: freturn

  public float getPivotY();
    Code:
       0: aload_0
       1: getfield      #46                 // Field f:F
       4: freturn

  public float getRotation();
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:F
       4: freturn

  public float getScaleX();
    Code:
       0: aload_0
       1: getfield      #48                 // Field g:F
       4: freturn

  public float getScaleY();
    Code:
       0: aload_0
       1: getfield      #50                 // Field h:F
       4: freturn

  public float getTranslateX();
    Code:
       0: aload_0
       1: getfield      #52                 // Field i:F
       4: freturn

  public float getTranslateY();
    Code:
       0: aload_0
       1: getfield      #54                 // Field j:F
       4: freturn

  public void setPivotX(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #44                 // Field e:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #44                 // Field e:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setPivotY(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #46                 // Field f:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #46                 // Field f:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setRotation(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #42                 // Field b:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #42                 // Field b:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setScaleX(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #48                 // Field g:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #48                 // Field g:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setScaleY(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #50                 // Field h:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #50                 // Field h:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setTranslateX(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #52                 // Field i:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #52                 // Field i:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return

  public void setTranslateY(float);
    Code:
       0: fload_1
       1: aload_0
       2: getfield      #54                 // Field j:F
       5: fcmpl
       6: ifeq          18
       9: aload_0
      10: fload_1
      11: putfield      #54                 // Field j:F
      14: aload_0
      15: invokespecial #155                // Method a:()V
      18: return
}

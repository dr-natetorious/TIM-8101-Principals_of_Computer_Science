public abstract class android.support.v4.app.ah {
  static {};
    Code:
       0: return

  public android.os.Parcelable a(android.view.View, android.graphics.Matrix, android.graphics.RectF);
    Code:
       0: aload_1
       1: instanceof    #85                 // class android/widget/ImageView
       4: ifeq          115
       7: aload_1
       8: checkcast     #85                 // class android/widget/ImageView
      11: astore        7
      13: aload         7
      15: invokevirtual #89                 // Method android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
      18: astore        8
      20: aload         7
      22: invokevirtual #92                 // Method android/widget/ImageView.getBackground:()Landroid/graphics/drawable/Drawable;
      25: astore        9
      27: aload         8
      29: ifnull        115
      32: aload         9
      34: ifnonnull     115
      37: aload         8
      39: invokestatic  #94                 // Method a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
      42: astore        8
      44: aload         8
      46: ifnull        115
      49: new           #96                 // class android/os/Bundle
      52: dup
      53: invokespecial #98                 // Method android/os/Bundle."<init>":()V
      56: astore_1
      57: aload_1
      58: ldc           #100                // String sharedElement:snapshot:bitmap
      60: aload         8
      62: invokevirtual #104                // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      65: aload_1
      66: ldc           #106                // String sharedElement:snapshot:imageScaleType
      68: aload         7
      70: invokevirtual #110                // Method android/widget/ImageView.getScaleType:()Landroid/widget/ImageView$ScaleType;
      73: invokevirtual #116                // Method android/widget/ImageView$ScaleType.toString:()Ljava/lang/String;
      76: invokevirtual #120                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      79: aload         7
      81: invokevirtual #110                // Method android/widget/ImageView.getScaleType:()Landroid/widget/ImageView$ScaleType;
      84: getstatic     #124                // Field android/widget/ImageView$ScaleType.MATRIX:Landroid/widget/ImageView$ScaleType;
      87: if_acmpne     113
      90: aload         7
      92: invokevirtual #128                // Method android/widget/ImageView.getImageMatrix:()Landroid/graphics/Matrix;
      95: astore_2
      96: bipush        9
      98: newarray       float
     100: astore_3
     101: aload_2
     102: aload_3
     103: invokevirtual #134                // Method android/graphics/Matrix.getValues:([F)V
     106: aload_1
     107: ldc           #136                // String sharedElement:snapshot:imageMatrix
     109: aload_3
     110: invokevirtual #140                // Method android/os/Bundle.putFloatArray:(Ljava/lang/String;[F)V
     113: aload_1
     114: areturn
     115: aload_3
     116: invokevirtual #146                // Method android/graphics/RectF.width:()F
     119: invokestatic  #150                // Method java/lang/Math.round:(F)I
     122: istore        6
     124: aload_3
     125: invokevirtual #153                // Method android/graphics/RectF.height:()F
     128: invokestatic  #150                // Method java/lang/Math.round:(F)I
     131: istore        5
     133: aconst_null
     134: astore        8
     136: aload         8
     138: astore        7
     140: iload         6
     142: ifle          280
     145: aload         8
     147: astore        7
     149: iload         5
     151: ifle          280
     154: fconst_1
     155: getstatic     #26                 // Field b:I
     158: i2f
     159: iload         6
     161: iload         5
     163: imul
     164: i2f
     165: fdiv
     166: invokestatic  #32                 // Method java/lang/Math.min:(FF)F
     169: fstore        4
     171: iload         6
     173: i2f
     174: fload         4
     176: fmul
     177: f2i
     178: istore        6
     180: iload         5
     182: i2f
     183: fload         4
     185: fmul
     186: f2i
     187: istore        5
     189: aload_0
     190: getfield      #155                // Field a:Landroid/graphics/Matrix;
     193: ifnonnull     207
     196: aload_0
     197: new           #130                // class android/graphics/Matrix
     200: dup
     201: invokespecial #156                // Method android/graphics/Matrix."<init>":()V
     204: putfield      #155                // Field a:Landroid/graphics/Matrix;
     207: aload_0
     208: getfield      #155                // Field a:Landroid/graphics/Matrix;
     211: aload_2
     212: invokevirtual #160                // Method android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
     215: aload_0
     216: getfield      #155                // Field a:Landroid/graphics/Matrix;
     219: aload_3
     220: getfield      #163                // Field android/graphics/RectF.left:F
     223: fneg
     224: aload_3
     225: getfield      #165                // Field android/graphics/RectF.top:F
     228: fneg
     229: invokevirtual #169                // Method android/graphics/Matrix.postTranslate:(FF)Z
     232: pop
     233: aload_0
     234: getfield      #155                // Field a:Landroid/graphics/Matrix;
     237: fload         4
     239: fload         4
     241: invokevirtual #172                // Method android/graphics/Matrix.postScale:(FF)Z
     244: pop
     245: iload         6
     247: iload         5
     249: getstatic     #44                 // Field android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
     252: invokestatic  #50                 // Method android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
     255: astore        7
     257: new           #52                 // class android/graphics/Canvas
     260: dup
     261: aload         7
     263: invokespecial #56                 // Method android/graphics/Canvas."<init>":(Landroid/graphics/Bitmap;)V
     266: astore_2
     267: aload_2
     268: aload_0
     269: getfield      #155                // Field a:Landroid/graphics/Matrix;
     272: invokevirtual #175                // Method android/graphics/Canvas.concat:(Landroid/graphics/Matrix;)V
     275: aload_1
     276: aload_2
     277: invokevirtual #178                // Method android/view/View.draw:(Landroid/graphics/Canvas;)V
     280: aload         7
     282: areturn

  public android.view.View a(android.content.Context, android.os.Parcelable);
    Code:
       0: aload_2
       1: instanceof    #96                 // class android/os/Bundle
       4: istore_3
       5: aconst_null
       6: astore        4
       8: iload_3
       9: ifeq          106
      12: aload_2
      13: checkcast     #96                 // class android/os/Bundle
      16: astore_2
      17: aload_2
      18: ldc           #100                // String sharedElement:snapshot:bitmap
      20: invokevirtual #183                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      23: checkcast     #46                 // class android/graphics/Bitmap
      26: astore        4
      28: aload         4
      30: ifnonnull     35
      33: aconst_null
      34: areturn
      35: new           #85                 // class android/widget/ImageView
      38: dup
      39: aload_1
      40: invokespecial #186                // Method android/widget/ImageView."<init>":(Landroid/content/Context;)V
      43: astore_1
      44: aload_1
      45: aload         4
      47: invokevirtual #189                // Method android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
      50: aload_1
      51: aload_2
      52: ldc           #106                // String sharedElement:snapshot:imageScaleType
      54: invokevirtual #193                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      57: invokestatic  #197                // Method android/widget/ImageView$ScaleType.valueOf:(Ljava/lang/String;)Landroid/widget/ImageView$ScaleType;
      60: invokevirtual #201                // Method android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
      63: aload_1
      64: astore        4
      66: aload_1
      67: invokevirtual #110                // Method android/widget/ImageView.getScaleType:()Landroid/widget/ImageView$ScaleType;
      70: getstatic     #124                // Field android/widget/ImageView$ScaleType.MATRIX:Landroid/widget/ImageView$ScaleType;
      73: if_acmpne     134
      76: aload_2
      77: ldc           #136                // String sharedElement:snapshot:imageMatrix
      79: invokevirtual #205                // Method android/os/Bundle.getFloatArray:(Ljava/lang/String;)[F
      82: astore_2
      83: new           #130                // class android/graphics/Matrix
      86: dup
      87: invokespecial #156                // Method android/graphics/Matrix."<init>":()V
      90: astore        4
      92: aload         4
      94: aload_2
      95: invokevirtual #208                // Method android/graphics/Matrix.setValues:([F)V
      98: aload_1
      99: aload         4
     101: invokevirtual #211                // Method android/widget/ImageView.setImageMatrix:(Landroid/graphics/Matrix;)V
     104: aload_1
     105: areturn
     106: aload_2
     107: instanceof    #46                 // class android/graphics/Bitmap
     110: ifeq          134
     113: aload_2
     114: checkcast     #46                 // class android/graphics/Bitmap
     117: astore_2
     118: new           #85                 // class android/widget/ImageView
     121: dup
     122: aload_1
     123: invokespecial #186                // Method android/widget/ImageView."<init>":(Landroid/content/Context;)V
     126: astore        4
     128: aload         4
     130: aload_2
     131: invokevirtual #189                // Method android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
     134: aload         4
     136: areturn

  public void a(java.util.List<android.view.View>);
    Code:
       0: return

  public void a(java.util.List<java.lang.String>, java.util.List<android.view.View>, android.support.v4.app.ah$a);
    Code:
       0: aload_3
       1: invokeinterface #217,  1          // InterfaceMethod android/support/v4/app/ah$a.a:()V
       6: return

  public void a(java.util.List<java.lang.String>, java.util.List<android.view.View>, java.util.List<android.view.View>);
    Code:
       0: return

  public void a(java.util.List<java.lang.String>, java.util.Map<java.lang.String, android.view.View>);
    Code:
       0: return

  public void b(java.util.List<java.lang.String>, java.util.List<android.view.View>, java.util.List<android.view.View>);
    Code:
       0: return
}

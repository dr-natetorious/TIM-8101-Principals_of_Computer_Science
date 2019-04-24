public class android.support.v7.widget.q {
  public android.support.v7.widget.q(android.widget.ImageView);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/widget/ImageView;
       9: return

  public void a(int);
    Code:
       0: iload_1
       1: ifeq          35
       4: aload_0
       5: getfield      #17                 // Field a:Landroid/widget/ImageView;
       8: invokevirtual #71                 // Method android/widget/ImageView.getContext:()Landroid/content/Context;
      11: iload_1
      12: invokestatic  #76                 // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      15: astore_2
      16: aload_2
      17: ifnull        24
      20: aload_2
      21: invokestatic  #81                 // Method android/support/v7/widget/ao.b:(Landroid/graphics/drawable/Drawable;)V
      24: aload_0
      25: getfield      #17                 // Field a:Landroid/widget/ImageView;
      28: aload_2
      29: invokevirtual #84                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      32: goto          43
      35: aload_0
      36: getfield      #17                 // Field a:Landroid/widget/ImageView;
      39: aconst_null
      40: invokevirtual #84                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      43: aload_0
      44: invokevirtual #86                 // Method d:()V
      47: return

  void a(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
       4: ifnonnull     18
       7: aload_0
       8: new           #23                 // class android/support/v7/widget/bn
      11: dup
      12: invokespecial #24                 // Method android/support/v7/widget/bn."<init>":()V
      15: putfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      18: aload_0
      19: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      22: aload_1
      23: putfield      #37                 // Field android/support/v7/widget/bn.a:Landroid/content/res/ColorStateList;
      26: aload_0
      27: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      30: iconst_1
      31: putfield      #34                 // Field android/support/v7/widget/bn.d:Z
      34: aload_0
      35: invokevirtual #86                 // Method d:()V
      38: return

  void a(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
       4: ifnonnull     18
       7: aload_0
       8: new           #23                 // class android/support/v7/widget/bn
      11: dup
      12: invokespecial #24                 // Method android/support/v7/widget/bn."<init>":()V
      15: putfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      18: aload_0
      19: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      22: aload_1
      23: putfield      #45                 // Field android/support/v7/widget/bn.b:Landroid/graphics/PorterDuff$Mode;
      26: aload_0
      27: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      30: iconst_1
      31: putfield      #42                 // Field android/support/v7/widget/bn.c:Z
      34: aload_0
      35: invokevirtual #86                 // Method d:()V
      38: return

  public void a(android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/widget/ImageView;
       4: invokevirtual #71                 // Method android/widget/ImageView.getContext:()Landroid/content/Context;
       7: aload_1
       8: getstatic     #97                 // Field android/support/v7/a/a$j.AppCompatImageView:[I
      11: iload_2
      12: iconst_0
      13: invokestatic  #102                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      16: astore        4
      18: aload_0
      19: getfield      #17                 // Field a:Landroid/widget/ImageView;
      22: invokevirtual #106                // Method android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
      25: astore_3
      26: aload_3
      27: astore_1
      28: aload_3
      29: ifnonnull     77
      32: aload         4
      34: getstatic     #109                // Field android/support/v7/a/a$j.AppCompatImageView_srcCompat:I
      37: iconst_m1
      38: invokevirtual #113                // Method android/support/v7/widget/bp.g:(II)I
      41: istore_2
      42: aload_3
      43: astore_1
      44: iload_2
      45: iconst_m1
      46: if_icmpeq     77
      49: aload_0
      50: getfield      #17                 // Field a:Landroid/widget/ImageView;
      53: invokevirtual #71                 // Method android/widget/ImageView.getContext:()Landroid/content/Context;
      56: iload_2
      57: invokestatic  #76                 // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      60: astore_3
      61: aload_3
      62: astore_1
      63: aload_3
      64: ifnull        77
      67: aload_0
      68: getfield      #17                 // Field a:Landroid/widget/ImageView;
      71: aload_3
      72: invokevirtual #84                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      75: aload_3
      76: astore_1
      77: aload_1
      78: ifnull        85
      81: aload_1
      82: invokestatic  #81                 // Method android/support/v7/widget/ao.b:(Landroid/graphics/drawable/Drawable;)V
      85: aload         4
      87: getstatic     #116                // Field android/support/v7/a/a$j.AppCompatImageView_tint:I
      90: invokevirtual #119                // Method android/support/v7/widget/bp.g:(I)Z
      93: ifeq          111
      96: aload_0
      97: getfield      #17                 // Field a:Landroid/widget/ImageView;
     100: aload         4
     102: getstatic     #116                // Field android/support/v7/a/a$j.AppCompatImageView_tint:I
     105: invokevirtual #122                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
     108: invokestatic  #125                // Method android/support/v4/widget/h.a:(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
     111: aload         4
     113: getstatic     #128                // Field android/support/v7/a/a$j.AppCompatImageView_tintMode:I
     116: invokevirtual #119                // Method android/support/v7/widget/bp.g:(I)Z
     119: ifeq          142
     122: aload_0
     123: getfield      #17                 // Field a:Landroid/widget/ImageView;
     126: aload         4
     128: getstatic     #128                // Field android/support/v7/a/a$j.AppCompatImageView_tintMode:I
     131: iconst_m1
     132: invokevirtual #130                // Method android/support/v7/widget/bp.a:(II)I
     135: aconst_null
     136: invokestatic  #133                // Method android/support/v7/widget/ao.a:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
     139: invokestatic  #136                // Method android/support/v4/widget/h.a:(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
     142: aload         4
     144: invokevirtual #137                // Method android/support/v7/widget/bp.a:()V
     147: return
     148: astore_1
     149: aload         4
     151: invokevirtual #137                // Method android/support/v7/widget/bp.a:()V
     154: aload_1
     155: athrow
    Exception table:
       from    to  target type
          18    26   148   any
          32    42   148   any
          49    61   148   any
          67    75   148   any
          81    85   148   any
          85   111   148   any
         111   142   148   any

  boolean a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/widget/ImageView;
       4: invokevirtual #140                // Method android/widget/ImageView.getBackground:()Landroid/graphics/drawable/Drawable;
       7: astore_1
       8: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
      11: bipush        21
      13: if_icmplt     25
      16: aload_1
      17: instanceof    #142                // class android/graphics/drawable/RippleDrawable
      20: ifeq          25
      23: iconst_0
      24: ireturn
      25: iconst_1
      26: ireturn

  android.content.res.ColorStateList b();
    Code:
       0: aload_0
       1: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
       4: ifnull        15
       7: aload_0
       8: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      11: getfield      #37                 // Field android/support/v7/widget/bn.a:Landroid/content/res/ColorStateList;
      14: areturn
      15: aconst_null
      16: areturn

  android.graphics.PorterDuff$Mode c();
    Code:
       0: aload_0
       1: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
       4: ifnull        15
       7: aload_0
       8: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      11: getfield      #45                 // Field android/support/v7/widget/bn.b:Landroid/graphics/PorterDuff$Mode;
      14: areturn
      15: aconst_null
      16: areturn

  void d();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/widget/ImageView;
       4: invokevirtual #106                // Method android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
       7: astore_2
       8: aload_2
       9: ifnull        16
      12: aload_2
      13: invokestatic  #81                 // Method android/support/v7/widget/ao.b:(Landroid/graphics/drawable/Drawable;)V
      16: aload_2
      17: ifnull        76
      20: aload_0
      21: invokespecial #146                // Method e:()Z
      24: ifeq          36
      27: aload_0
      28: aload_2
      29: invokespecial #148                // Method a:(Landroid/graphics/drawable/Drawable;)Z
      32: ifeq          36
      35: return
      36: aload_0
      37: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      40: ifnull        61
      43: aload_0
      44: getfield      #89                 // Field c:Landroid/support/v7/widget/bn;
      47: astore_1
      48: aload_2
      49: aload_1
      50: aload_0
      51: getfield      #17                 // Field a:Landroid/widget/ImageView;
      54: invokevirtual #51                 // Method android/widget/ImageView.getDrawableState:()[I
      57: invokestatic  #56                 // Method android/support/v7/widget/m.a:(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/bn;[I)V
      60: return
      61: aload_0
      62: getfield      #66                 // Field b:Landroid/support/v7/widget/bn;
      65: ifnull        76
      68: aload_0
      69: getfield      #66                 // Field b:Landroid/support/v7/widget/bn;
      72: astore_1
      73: goto          48
      76: return
}

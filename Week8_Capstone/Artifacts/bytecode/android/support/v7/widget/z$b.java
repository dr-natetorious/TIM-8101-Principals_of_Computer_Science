class android.support.v7.widget.z$b extends android.support.v7.widget.aw {
  android.widget.ListAdapter a;

  final android.support.v7.widget.z b;

  public android.support.v7.widget.z$b(android.support.v7.widget.z, android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #24                 // Field b:Landroid/support/v7/widget/z;
       5: aload_0
       6: aload_2
       7: aload_3
       8: iload         4
      10: invokespecial #27                 // Method android/support/v7/widget/aw."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      13: aload_0
      14: new           #29                 // class android/graphics/Rect
      17: dup
      18: invokespecial #32                 // Method android/graphics/Rect."<init>":()V
      21: putfield      #34                 // Field i:Landroid/graphics/Rect;
      24: aload_0
      25: aload_1
      26: invokevirtual #37                 // Method b:(Landroid/view/View;)V
      29: aload_0
      30: iconst_1
      31: invokevirtual #40                 // Method a:(Z)V
      34: aload_0
      35: iconst_0
      36: invokevirtual #43                 // Method a:(I)V
      39: aload_0
      40: new           #9                  // class android/support/v7/widget/z$b$1
      43: dup
      44: aload_0
      45: aload_1
      46: invokespecial #46                 // Method android/support/v7/widget/z$b$1."<init>":(Landroid/support/v7/widget/z$b;Landroid/support/v7/widget/z;)V
      49: invokevirtual #49                 // Method a:(Landroid/widget/AdapterView$OnItemClickListener;)V
      52: return

  static void a(android.support.v7.widget.z$b);
    Code:
       0: aload_0
       1: invokespecial #54                 // Method android/support/v7/widget/aw.d:()V
       4: return

  public java.lang.CharSequence a();
    Code:
       0: aload_0
       1: getfield      #57                 // Field h:Ljava/lang/CharSequence;
       4: areturn

  public void a(android.widget.ListAdapter);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #60                 // Method android/support/v7/widget/aw.a:(Landroid/widget/ListAdapter;)V
       5: aload_0
       6: aload_1
       7: putfield      #62                 // Field a:Landroid/widget/ListAdapter;
      10: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #57                 // Field h:Ljava/lang/CharSequence;
       5: return

  boolean a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #69                 // Method android/support/v4/view/s.z:(Landroid/view/View;)Z
       4: ifeq          20
       7: aload_1
       8: aload_0
       9: getfield      #34                 // Field i:Landroid/graphics/Rect;
      12: invokevirtual #75                 // Method android/view/View.getGlobalVisibleRect:(Landroid/graphics/Rect;)Z
      15: ifeq          20
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn

  void b();
    Code:
       0: aload_0
       1: invokevirtual #78                 // Method h:()Landroid/graphics/drawable/Drawable;
       4: astore        8
       6: iconst_0
       7: istore_2
       8: aload         8
      10: ifnull        67
      13: aload         8
      15: aload_0
      16: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      19: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
      22: invokevirtual #86                 // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      25: pop
      26: aload_0
      27: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      30: invokestatic  #90                 // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
      33: ifeq          52
      36: aload_0
      37: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      40: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
      43: getfield      #94                 // Field android/graphics/Rect.right:I
      46: istore_1
      47: iload_1
      48: istore_2
      49: goto          93
      52: aload_0
      53: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      56: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
      59: getfield      #97                 // Field android/graphics/Rect.left:I
      62: ineg
      63: istore_1
      64: goto          47
      67: aload_0
      68: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      71: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
      74: astore        8
      76: aload_0
      77: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      80: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
      83: iconst_0
      84: putfield      #94                 // Field android/graphics/Rect.right:I
      87: aload         8
      89: iconst_0
      90: putfield      #97                 // Field android/graphics/Rect.left:I
      93: aload_0
      94: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      97: invokevirtual #101                // Method android/support/v7/widget/z.getPaddingLeft:()I
     100: istore        5
     102: aload_0
     103: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     106: invokevirtual #104                // Method android/support/v7/widget/z.getPaddingRight:()I
     109: istore        6
     111: aload_0
     112: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     115: invokevirtual #107                // Method android/support/v7/widget/z.getWidth:()I
     118: istore        7
     120: aload_0
     121: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     124: invokestatic  #111                // Method android/support/v7/widget/z.c:(Landroid/support/v7/widget/z;)I
     127: bipush        -2
     129: if_icmpne     223
     132: aload_0
     133: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     136: aload_0
     137: getfield      #62                 // Field a:Landroid/widget/ListAdapter;
     140: checkcast     #113                // class android/widget/SpinnerAdapter
     143: aload_0
     144: invokevirtual #78                 // Method h:()Landroid/graphics/drawable/Drawable;
     147: invokevirtual #116                // Method android/support/v7/widget/z.a:(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
     150: istore_3
     151: aload_0
     152: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     155: invokevirtual #120                // Method android/support/v7/widget/z.getContext:()Landroid/content/Context;
     158: invokevirtual #126                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
     161: invokevirtual #132                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     164: getfield      #137                // Field android/util/DisplayMetrics.widthPixels:I
     167: aload_0
     168: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     171: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
     174: getfield      #97                 // Field android/graphics/Rect.left:I
     177: isub
     178: aload_0
     179: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     182: invokestatic  #81                 // Method android/support/v7/widget/z.b:(Landroid/support/v7/widget/z;)Landroid/graphics/Rect;
     185: getfield      #94                 // Field android/graphics/Rect.right:I
     188: isub
     189: istore        4
     191: iload_3
     192: istore_1
     193: iload_3
     194: iload         4
     196: if_icmple     202
     199: iload         4
     201: istore_1
     202: iload_1
     203: iload         7
     205: iload         5
     207: isub
     208: iload         6
     210: isub
     211: invokestatic  #143                // Method java/lang/Math.max:(II)I
     214: istore_1
     215: aload_0
     216: iload_1
     217: invokevirtual #146                // Method g:(I)V
     220: goto          257
     223: aload_0
     224: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     227: invokestatic  #111                // Method android/support/v7/widget/z.c:(Landroid/support/v7/widget/z;)I
     230: iconst_m1
     231: if_icmpne     246
     234: iload         7
     236: iload         5
     238: isub
     239: iload         6
     241: isub
     242: istore_1
     243: goto          215
     246: aload_0
     247: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     250: invokestatic  #111                // Method android/support/v7/widget/z.c:(Landroid/support/v7/widget/z;)I
     253: istore_1
     254: goto          215
     257: aload_0
     258: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
     261: invokestatic  #90                 // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
     264: ifeq          283
     267: iload_2
     268: iload         7
     270: iload         6
     272: isub
     273: aload_0
     274: invokevirtual #149                // Method l:()I
     277: isub
     278: iadd
     279: istore_1
     280: goto          288
     283: iload_2
     284: iload         5
     286: iadd
     287: istore_1
     288: aload_0
     289: iload_1
     290: invokevirtual #151                // Method c:(I)V
     293: return

  public void d();
    Code:
       0: aload_0
       1: invokevirtual #155                // Method f:()Z
       4: istore_1
       5: aload_0
       6: invokevirtual #157                // Method b:()V
       9: aload_0
      10: iconst_2
      11: invokevirtual #159                // Method h:(I)V
      14: aload_0
      15: invokespecial #54                 // Method android/support/v7/widget/aw.d:()V
      18: aload_0
      19: invokevirtual #162                // Method g:()Landroid/widget/ListView;
      22: iconst_1
      23: invokevirtual #167                // Method android/widget/ListView.setChoiceMode:(I)V
      26: aload_0
      27: aload_0
      28: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      31: invokevirtual #170                // Method android/support/v7/widget/z.getSelectedItemPosition:()I
      34: invokevirtual #172                // Method i:(I)V
      37: iload_1
      38: ifeq          42
      41: return
      42: aload_0
      43: getfield      #24                 // Field b:Landroid/support/v7/widget/z;
      46: invokevirtual #176                // Method android/support/v7/widget/z.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      49: astore_2
      50: aload_2
      51: ifnull        81
      54: new           #11                 // class android/support/v7/widget/z$b$2
      57: dup
      58: aload_0
      59: invokespecial #178                // Method android/support/v7/widget/z$b$2."<init>":(Landroid/support/v7/widget/z$b;)V
      62: astore_3
      63: aload_2
      64: aload_3
      65: invokevirtual #184                // Method android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      68: aload_0
      69: new           #13                 // class android/support/v7/widget/z$b$3
      72: dup
      73: aload_0
      74: aload_3
      75: invokespecial #187                // Method android/support/v7/widget/z$b$3."<init>":(Landroid/support/v7/widget/z$b;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      78: invokevirtual #190                // Method a:(Landroid/widget/PopupWindow$OnDismissListener;)V
      81: return
}

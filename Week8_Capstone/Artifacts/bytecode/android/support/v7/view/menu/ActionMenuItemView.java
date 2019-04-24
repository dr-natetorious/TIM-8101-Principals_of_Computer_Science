public class android.support.v7.view.menu.ActionMenuItemView extends android.support.v7.widget.ac implements android.support.v7.view.menu.p$a,android.support.v7.widget.ActionMenuView$a,android.view.View$OnClickListener {
  android.support.v7.view.menu.j b;

  android.support.v7.view.menu.h$b c;

  android.support.v7.view.menu.ActionMenuItemView$b d;

  public android.support.v7.view.menu.ActionMenuItemView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #39                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.view.menu.ActionMenuItemView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #43                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.v7.view.menu.ActionMenuItemView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #44                 // Method android/support/v7/widget/ac."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_1
       8: invokevirtual #50                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      11: astore        4
      13: aload_0
      14: aload_0
      15: invokespecial #53                 // Method e:()Z
      18: putfield      #55                 // Field h:Z
      21: aload_1
      22: aload_2
      23: getstatic     #61                 // Field android/support/v7/a/a$j.ActionMenuItemView:[I
      26: iload_3
      27: iconst_0
      28: invokevirtual #65                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      31: astore_1
      32: aload_0
      33: aload_1
      34: getstatic     #68                 // Field android/support/v7/a/a$j.ActionMenuItemView_android_minWidth:I
      37: iconst_0
      38: invokevirtual #74                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      41: putfield      #76                 // Field j:I
      44: aload_1
      45: invokevirtual #80                 // Method android/content/res/TypedArray.recycle:()V
      48: aload_0
      49: aload         4
      51: invokevirtual #86                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      54: getfield      #92                 // Field android/util/DisplayMetrics.density:F
      57: ldc           #93                 // float 32.0f
      59: fmul
      60: ldc           #94                 // float 0.5f
      62: fadd
      63: f2i
      64: putfield      #96                 // Field l:I
      67: aload_0
      68: aload_0
      69: invokevirtual #100                // Method setOnClickListener:(Landroid/view/View$OnClickListener;)V
      72: aload_0
      73: iconst_m1
      74: putfield      #102                // Field k:I
      77: aload_0
      78: iconst_0
      79: invokevirtual #106                // Method setSaveEnabled:(Z)V
      82: return

  public void a(android.support.v7.view.menu.j, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #137                // Field b:Landroid/support/v7/view/menu/j;
       5: aload_0
       6: aload_1
       7: invokevirtual #171                // Method android/support/v7/view/menu/j.getIcon:()Landroid/graphics/drawable/Drawable;
      10: invokevirtual #175                // Method setIcon:(Landroid/graphics/drawable/Drawable;)V
      13: aload_0
      14: aload_1
      15: aload_0
      16: invokevirtual #178                // Method android/support/v7/view/menu/j.a:(Landroid/support/v7/view/menu/p$a;)Ljava/lang/CharSequence;
      19: invokevirtual #181                // Method setTitle:(Ljava/lang/CharSequence;)V
      22: aload_0
      23: aload_1
      24: invokevirtual #185                // Method android/support/v7/view/menu/j.getItemId:()I
      27: invokevirtual #189                // Method setId:(I)V
      30: aload_1
      31: invokevirtual #192                // Method android/support/v7/view/menu/j.isVisible:()Z
      34: ifeq          42
      37: iconst_0
      38: istore_2
      39: goto          45
      42: bipush        8
      44: istore_2
      45: aload_0
      46: iload_2
      47: invokevirtual #195                // Method setVisibility:(I)V
      50: aload_0
      51: aload_1
      52: invokevirtual #198                // Method android/support/v7/view/menu/j.isEnabled:()Z
      55: invokevirtual #201                // Method setEnabled:(Z)V
      58: aload_1
      59: invokevirtual #204                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      62: ifeq          84
      65: aload_0
      66: getfield      #206                // Field g:Landroid/support/v7/widget/as;
      69: ifnonnull     84
      72: aload_0
      73: new           #12                 // class android/support/v7/view/menu/ActionMenuItemView$a
      76: dup
      77: aload_0
      78: invokespecial #209                // Method android/support/v7/view/menu/ActionMenuItemView$a."<init>":(Landroid/support/v7/view/menu/ActionMenuItemView;)V
      81: putfield      #206                // Field g:Landroid/support/v7/widget/as;
      84: return

  public boolean a();
    Code:
       0: aload_0
       1: invokevirtual #212                // Method getText:()Ljava/lang/CharSequence;
       4: invokestatic  #133                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
       7: iconst_1
       8: ixor
       9: ireturn

  public boolean b();
    Code:
       0: iconst_1
       1: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: invokevirtual #214                // Method a:()Z
       4: ifeq          19
       7: aload_0
       8: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
      11: invokevirtual #171                // Method android/support/v7/view/menu/j.getIcon:()Landroid/graphics/drawable/Drawable;
      14: ifnonnull     19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: invokevirtual #214                // Method a:()Z
       4: ireturn

  public android.support.v7.view.menu.j getItemData();
    Code:
       0: aload_0
       1: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
       4: areturn

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #220                // Field c:Landroid/support/v7/view/menu/h$b;
       4: ifnull        21
       7: aload_0
       8: getfield      #220                // Field c:Landroid/support/v7/view/menu/h$b;
      11: aload_0
      12: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
      15: invokeinterface #225,  2          // InterfaceMethod android/support/v7/view/menu/h$b.a:(Landroid/support/v7/view/menu/j;)Z
      20: pop
      21: return

  public void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #229                // Method android/support/v7/widget/ac.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: aload_0
       7: invokespecial #53                 // Method e:()Z
      10: putfield      #55                 // Field h:Z
      13: aload_0
      14: invokespecial #231                // Method f:()V
      17: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #214                // Method a:()Z
       4: istore        5
       6: iload         5
       8: ifeq          38
      11: aload_0
      12: getfield      #102                // Field k:I
      15: iflt          38
      18: aload_0
      19: aload_0
      20: getfield      #102                // Field k:I
      23: aload_0
      24: invokevirtual #236                // Method getPaddingTop:()I
      27: aload_0
      28: invokevirtual #239                // Method getPaddingRight:()I
      31: aload_0
      32: invokevirtual #242                // Method getPaddingBottom:()I
      35: invokespecial #246                // Method android/support/v7/widget/ac.setPadding:(IIII)V
      38: aload_0
      39: iload_1
      40: iload_2
      41: invokespecial #248                // Method android/support/v7/widget/ac.onMeasure:(II)V
      44: iload_1
      45: invokestatic  #254                // Method android/view/View$MeasureSpec.getMode:(I)I
      48: istore_3
      49: iload_1
      50: invokestatic  #257                // Method android/view/View$MeasureSpec.getSize:(I)I
      53: istore_1
      54: aload_0
      55: invokevirtual #260                // Method getMeasuredWidth:()I
      58: istore        4
      60: iload_3
      61: ldc_w         #261                // int -2147483648
      64: if_icmpne     79
      67: iload_1
      68: aload_0
      69: getfield      #76                 // Field j:I
      72: invokestatic  #266                // Method java/lang/Math.min:(II)I
      75: istore_1
      76: goto          84
      79: aload_0
      80: getfield      #76                 // Field j:I
      83: istore_1
      84: iload_3
      85: ldc_w         #267                // int 1073741824
      88: if_icmpeq     116
      91: aload_0
      92: getfield      #76                 // Field j:I
      95: ifle          116
      98: iload         4
     100: iload_1
     101: if_icmpge     116
     104: aload_0
     105: iload_1
     106: ldc_w         #267                // int 1073741824
     109: invokestatic  #270                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     112: iload_2
     113: invokespecial #248                // Method android/support/v7/widget/ac.onMeasure:(II)V
     116: iload         5
     118: ifne          161
     121: aload_0
     122: getfield      #135                // Field f:Landroid/graphics/drawable/Drawable;
     125: ifnull        161
     128: aload_0
     129: aload_0
     130: invokevirtual #260                // Method getMeasuredWidth:()I
     133: aload_0
     134: getfield      #135                // Field f:Landroid/graphics/drawable/Drawable;
     137: invokevirtual #276                // Method android/graphics/drawable/Drawable.getBounds:()Landroid/graphics/Rect;
     140: invokevirtual #281                // Method android/graphics/Rect.width:()I
     143: isub
     144: iconst_2
     145: idiv
     146: aload_0
     147: invokevirtual #236                // Method getPaddingTop:()I
     150: aload_0
     151: invokevirtual #239                // Method getPaddingRight:()I
     154: aload_0
     155: invokevirtual #242                // Method getPaddingBottom:()I
     158: invokespecial #246                // Method android/support/v7/widget/ac.setPadding:(IIII)V
     161: return

  public void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_0
       1: aconst_null
       2: invokespecial #285                // Method android/support/v7/widget/ac.onRestoreInstanceState:(Landroid/os/Parcelable;)V
       5: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
       4: invokevirtual #204                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
       7: ifeq          31
      10: aload_0
      11: getfield      #206                // Field g:Landroid/support/v7/widget/as;
      14: ifnull        31
      17: aload_0
      18: getfield      #206                // Field g:Landroid/support/v7/widget/as;
      21: aload_0
      22: aload_1
      23: invokevirtual #293                // Method android/support/v7/widget/as.onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z
      26: ifeq          31
      29: iconst_1
      30: ireturn
      31: aload_0
      32: aload_1
      33: invokespecial #295                // Method android/support/v7/widget/ac.onTouchEvent:(Landroid/view/MotionEvent;)Z
      36: ireturn

  public void setCheckable(boolean);
    Code:
       0: return

  public void setChecked(boolean);
    Code:
       0: return

  public void setExpandedFormat(boolean);
    Code:
       0: aload_0
       1: getfield      #144                // Field i:Z
       4: iload_1
       5: if_icmpeq     27
       8: aload_0
       9: iload_1
      10: putfield      #144                // Field i:Z
      13: aload_0
      14: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
      17: ifnull        27
      20: aload_0
      21: getfield      #137                // Field b:Landroid/support/v7/view/menu/j;
      24: invokevirtual #300                // Method android/support/v7/view/menu/j.h:()V
      27: return

  public void setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #135                // Field f:Landroid/graphics/drawable/Drawable;
       5: aload_1
       6: ifnull        109
       9: aload_1
      10: invokevirtual #303                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
      13: istore        6
      15: aload_1
      16: invokevirtual #306                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      19: istore        5
      21: iload         6
      23: istore_3
      24: iload         5
      26: istore        4
      28: iload         6
      30: aload_0
      31: getfield      #96                 // Field l:I
      34: if_icmple     60
      37: aload_0
      38: getfield      #96                 // Field l:I
      41: i2f
      42: iload         6
      44: i2f
      45: fdiv
      46: fstore_2
      47: aload_0
      48: getfield      #96                 // Field l:I
      51: istore_3
      52: iload         5
      54: i2f
      55: fload_2
      56: fmul
      57: f2i
      58: istore        4
      60: iload_3
      61: istore        6
      63: iload         4
      65: istore        5
      67: iload         4
      69: aload_0
      70: getfield      #96                 // Field l:I
      73: if_icmple     99
      76: aload_0
      77: getfield      #96                 // Field l:I
      80: i2f
      81: iload         4
      83: i2f
      84: fdiv
      85: fstore_2
      86: aload_0
      87: getfield      #96                 // Field l:I
      90: istore        5
      92: iload_3
      93: i2f
      94: fload_2
      95: fmul
      96: f2i
      97: istore        6
      99: aload_1
     100: iconst_0
     101: iconst_0
     102: iload         6
     104: iload         5
     106: invokevirtual #309                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     109: aload_0
     110: aload_1
     111: aconst_null
     112: aconst_null
     113: aconst_null
     114: invokevirtual #313                // Method setCompoundDrawables:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
     117: aload_0
     118: invokespecial #231                // Method f:()V
     121: return

  public void setItemInvoker(android.support.v7.view.menu.h$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #220                // Field c:Landroid/support/v7/view/menu/h$b;
       5: return

  public void setPadding(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #102                // Field k:I
       5: aload_0
       6: iload_1
       7: iload_2
       8: iload_3
       9: iload         4
      11: invokespecial #246                // Method android/support/v7/widget/ac.setPadding:(IIII)V
      14: return

  public void setPopupCallback(android.support.v7.view.menu.ActionMenuItemView$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #319                // Field d:Landroid/support/v7/view/menu/ActionMenuItemView$b;
       5: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #127                // Field e:Ljava/lang/CharSequence;
       5: aload_0
       6: invokespecial #231                // Method f:()V
       9: return
}

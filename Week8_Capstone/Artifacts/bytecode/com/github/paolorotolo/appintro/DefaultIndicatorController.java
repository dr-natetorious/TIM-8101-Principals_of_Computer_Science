class com.github.paolorotolo.appintro.DefaultIndicatorController implements com.github.paolorotolo.appintro.IndicatorController {
  public static final int DEFAULT_COLOR;

  int mCurrentPosition;

  int selectedDotColor;

  int unselectedDotColor;

  com.github.paolorotolo.appintro.DefaultIndicatorController();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #28                 // Field selectedDotColor:I
       9: aload_0
      10: iconst_1
      11: putfield      #30                 // Field unselectedDotColor:I
      14: return

  public void initialize(int);
    Code:
       0: aload_0
       1: new           #35                 // class java/util/ArrayList
       4: dup
       5: invokespecial #36                 // Method java/util/ArrayList."<init>":()V
       8: putfield      #38                 // Field mDots:Ljava/util/List;
      11: aload_0
      12: iload_1
      13: putfield      #40                 // Field mSlideCount:I
      16: aload_0
      17: iconst_m1
      18: putfield      #28                 // Field selectedDotColor:I
      21: aload_0
      22: iconst_m1
      23: putfield      #30                 // Field unselectedDotColor:I
      26: iconst_0
      27: istore_2
      28: iload_2
      29: iload_1
      30: if_icmpge     100
      33: new           #42                 // class android/widget/ImageView
      36: dup
      37: aload_0
      38: getfield      #44                 // Field mContext:Landroid/content/Context;
      41: invokespecial #47                 // Method android/widget/ImageView."<init>":(Landroid/content/Context;)V
      44: astore_3
      45: aload_3
      46: aload_0
      47: getfield      #44                 // Field mContext:Landroid/content/Context;
      50: getstatic     #52                 // Field com/github/paolorotolo/appintro/R$drawable.indicator_dot_grey:I
      53: invokestatic  #58                 // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      56: invokevirtual #62                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      59: new           #64                 // class android/widget/LinearLayout$LayoutParams
      62: dup
      63: bipush        -2
      65: bipush        -2
      67: invokespecial #67                 // Method android/widget/LinearLayout$LayoutParams."<init>":(II)V
      70: astore        4
      72: aload_0
      73: getfield      #69                 // Field mDotLayout:Landroid/widget/LinearLayout;
      76: aload_3
      77: aload         4
      79: invokevirtual #75                 // Method android/widget/LinearLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
      82: aload_0
      83: getfield      #38                 // Field mDots:Ljava/util/List;
      86: aload_3
      87: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      92: pop
      93: iload_2
      94: iconst_1
      95: iadd
      96: istore_2
      97: goto          28
     100: aload_0
     101: iconst_0
     102: invokevirtual #84                 // Method selectPosition:(I)V
     105: return

  public android.view.View newInstance(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #44                 // Field mContext:Landroid/content/Context;
       5: aload_0
       6: aload_1
       7: getstatic     #91                 // Field com/github/paolorotolo/appintro/R$layout.default_indicator:I
      10: aconst_null
      11: invokestatic  #97                 // Method android/view/View.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
      14: checkcast     #71                 // class android/widget/LinearLayout
      17: putfield      #69                 // Field mDotLayout:Landroid/widget/LinearLayout;
      20: aload_0
      21: getfield      #69                 // Field mDotLayout:Landroid/widget/LinearLayout;
      24: areturn

  public void selectPosition(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #99                 // Field mCurrentPosition:I
       5: iconst_0
       6: istore_2
       7: iload_2
       8: aload_0
       9: getfield      #40                 // Field mSlideCount:I
      12: if_icmpge     122
      15: iload_2
      16: iload_1
      17: if_icmpne     27
      20: getstatic     #102                // Field com/github/paolorotolo/appintro/R$drawable.indicator_dot_white:I
      23: istore_3
      24: goto          31
      27: getstatic     #52                 // Field com/github/paolorotolo/appintro/R$drawable.indicator_dot_grey:I
      30: istore_3
      31: aload_0
      32: getfield      #44                 // Field mContext:Landroid/content/Context;
      35: iload_3
      36: invokestatic  #58                 // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      39: astore        4
      41: aload_0
      42: getfield      #28                 // Field selectedDotColor:I
      45: iconst_1
      46: if_icmpeq     69
      49: iload_2
      50: iload_1
      51: if_icmpne     69
      54: aload         4
      56: invokevirtual #108                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      59: aload_0
      60: getfield      #28                 // Field selectedDotColor:I
      63: getstatic     #114                // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      66: invokevirtual #118                // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      69: aload_0
      70: getfield      #30                 // Field unselectedDotColor:I
      73: iconst_1
      74: if_icmpeq     97
      77: iload_2
      78: iload_1
      79: if_icmpeq     97
      82: aload         4
      84: invokevirtual #108                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      87: aload_0
      88: getfield      #30                 // Field unselectedDotColor:I
      91: getstatic     #114                // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      94: invokevirtual #118                // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      97: aload_0
      98: getfield      #38                 // Field mDots:Ljava/util/List;
     101: iload_2
     102: invokeinterface #122,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     107: checkcast     #42                 // class android/widget/ImageView
     110: aload         4
     112: invokevirtual #62                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
     115: iload_2
     116: iconst_1
     117: iadd
     118: istore_2
     119: goto          7
     122: return

  public void setSelectedIndicatorColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #28                 // Field selectedDotColor:I
       5: aload_0
       6: aload_0
       7: getfield      #99                 // Field mCurrentPosition:I
      10: invokevirtual #84                 // Method selectPosition:(I)V
      13: return

  public void setUnselectedIndicatorColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #30                 // Field unselectedDotColor:I
       5: aload_0
       6: aload_0
       7: getfield      #99                 // Field mCurrentPosition:I
      10: invokevirtual #84                 // Method selectPosition:(I)V
      13: return
}

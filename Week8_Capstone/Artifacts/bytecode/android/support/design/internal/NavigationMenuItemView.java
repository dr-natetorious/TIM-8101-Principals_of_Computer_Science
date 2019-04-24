public class android.support.design.internal.NavigationMenuItemView extends android.support.design.internal.a implements android.support.v7.view.menu.p$a {
  boolean c;

  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #31                 // int 16842912
       7: iastore
       8: putstatic     #33                 // Field d:[I
      11: return

  public android.support.design.internal.NavigationMenuItemView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #39                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.internal.NavigationMenuItemView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #42                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.internal.NavigationMenuItemView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #43                 // Method android/support/design/internal/a."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #8                  // class android/support/design/internal/NavigationMenuItemView$1
      11: dup
      12: aload_0
      13: invokespecial #46                 // Method android/support/design/internal/NavigationMenuItemView$1."<init>":(Landroid/support/design/internal/NavigationMenuItemView;)V
      16: putfield      #48                 // Field m:Landroid/support/v4/view/b;
      19: aload_0
      20: iconst_0
      21: invokevirtual #52                 // Method setOrientation:(I)V
      24: aload_1
      25: invokestatic  #58                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      28: getstatic     #63                 // Field android/support/design/a$h.design_navigation_menu_item:I
      31: aload_0
      32: iconst_1
      33: invokevirtual #67                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      36: pop
      37: aload_0
      38: aload_1
      39: invokevirtual #73                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      42: getstatic     #78                 // Field android/support/design/a$d.design_navigation_icon_size:I
      45: invokevirtual #84                 // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      48: putfield      #86                 // Field e:I
      51: aload_0
      52: aload_0
      53: getstatic     #91                 // Field android/support/design/a$f.design_menu_item_text:I
      56: invokevirtual #95                 // Method findViewById:(I)Landroid/view/View;
      59: checkcast     #97                 // class android/widget/CheckedTextView
      62: putfield      #99                 // Field g:Landroid/widget/CheckedTextView;
      65: aload_0
      66: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
      69: iconst_1
      70: invokevirtual #103                // Method android/widget/CheckedTextView.setDuplicateParentStateEnabled:(Z)V
      73: aload_0
      74: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
      77: aload_0
      78: getfield      #48                 // Field m:Landroid/support/v4/view/b;
      81: invokestatic  #109                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
      84: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #133                // Field h:Landroid/widget/FrameLayout;
       4: ifnull        14
       7: aload_0
       8: getfield      #133                // Field h:Landroid/widget/FrameLayout;
      11: invokevirtual #201                // Method android/widget/FrameLayout.removeAllViews:()V
      14: aload_0
      15: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
      18: aconst_null
      19: aconst_null
      20: aconst_null
      21: aconst_null
      22: invokevirtual #208                // Method android/widget/CheckedTextView.setCompoundDrawables:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      25: return

  public void a(android.support.v7.view.menu.j, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #112                // Field i:Landroid/support/v7/view/menu/j;
       5: aload_1
       6: invokevirtual #212                // Method android/support/v7/view/menu/j.isVisible:()Z
       9: ifeq          17
      12: iconst_0
      13: istore_2
      14: goto          20
      17: bipush        8
      19: istore_2
      20: aload_0
      21: iload_2
      22: invokevirtual #213                // Method setVisibility:(I)V
      25: aload_0
      26: invokevirtual #216                // Method getBackground:()Landroid/graphics/drawable/Drawable;
      29: ifnonnull     40
      32: aload_0
      33: aload_0
      34: invokespecial #218                // Method e:()Landroid/graphics/drawable/StateListDrawable;
      37: invokestatic  #221                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      40: aload_0
      41: aload_1
      42: invokevirtual #224                // Method android/support/v7/view/menu/j.isCheckable:()Z
      45: invokevirtual #227                // Method setCheckable:(Z)V
      48: aload_0
      49: aload_1
      50: invokevirtual #230                // Method android/support/v7/view/menu/j.isChecked:()Z
      53: invokevirtual #233                // Method setChecked:(Z)V
      56: aload_0
      57: aload_1
      58: invokevirtual #236                // Method android/support/v7/view/menu/j.isEnabled:()Z
      61: invokevirtual #239                // Method setEnabled:(Z)V
      64: aload_0
      65: aload_1
      66: invokevirtual #118                // Method android/support/v7/view/menu/j.getTitle:()Ljava/lang/CharSequence;
      69: invokevirtual #243                // Method setTitle:(Ljava/lang/CharSequence;)V
      72: aload_0
      73: aload_1
      74: invokevirtual #122                // Method android/support/v7/view/menu/j.getIcon:()Landroid/graphics/drawable/Drawable;
      77: invokevirtual #247                // Method setIcon:(Landroid/graphics/drawable/Drawable;)V
      80: aload_0
      81: aload_1
      82: invokevirtual #126                // Method android/support/v7/view/menu/j.getActionView:()Landroid/view/View;
      85: invokespecial #249                // Method setActionView:(Landroid/view/View;)V
      88: aload_0
      89: aload_1
      90: invokevirtual #252                // Method android/support/v7/view/menu/j.getContentDescription:()Ljava/lang/CharSequence;
      93: invokevirtual #255                // Method setContentDescription:(Ljava/lang/CharSequence;)V
      96: aload_0
      97: aload_1
      98: invokevirtual #258                // Method android/support/v7/view/menu/j.getTooltipText:()Ljava/lang/CharSequence;
     101: invokestatic  #263                // Method android/support/v7/widget/br.a:(Landroid/view/View;Ljava/lang/CharSequence;)V
     104: aload_0
     105: invokespecial #265                // Method d:()V
     108: return

  public boolean b();
    Code:
       0: iconst_0
       1: ireturn

  public android.support.v7.view.menu.j getItemData();
    Code:
       0: aload_0
       1: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
       4: areturn

  protected int[] onCreateDrawableState(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_1
       3: iadd
       4: invokespecial #272                // Method android/support/design/internal/a.onCreateDrawableState:(I)[I
       7: astore_2
       8: aload_0
       9: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
      12: ifnull        43
      15: aload_0
      16: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
      19: invokevirtual #224                // Method android/support/v7/view/menu/j.isCheckable:()Z
      22: ifeq          43
      25: aload_0
      26: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
      29: invokevirtual #230                // Method android/support/v7/view/menu/j.isChecked:()Z
      32: ifeq          43
      35: aload_2
      36: getstatic     #33                 // Field d:[I
      39: invokestatic  #276                // Method mergeDrawableStates:([I[I)[I
      42: pop
      43: aload_2
      44: areturn

  public void setCheckable(boolean);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method refreshDrawableState:()V
       4: aload_0
       5: getfield      #281                // Field c:Z
       8: iload_1
       9: if_icmpeq     31
      12: aload_0
      13: iload_1
      14: putfield      #281                // Field c:Z
      17: aload_0
      18: getfield      #48                 // Field m:Landroid/support/v4/view/b;
      21: aload_0
      22: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
      25: sipush        2048
      28: invokevirtual #286                // Method android/support/v4/view/b.a:(Landroid/view/View;I)V
      31: return

  public void setChecked(boolean);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method refreshDrawableState:()V
       4: aload_0
       5: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
       8: iload_1
       9: invokevirtual #287                // Method android/widget/CheckedTextView.setChecked:(Z)V
      12: return

  public void setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: ifnull        65
       4: aload_1
       5: astore_2
       6: aload_0
       7: getfield      #289                // Field k:Z
      10: ifeq          46
      13: aload_1
      14: invokevirtual #295                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      17: astore_2
      18: aload_2
      19: ifnonnull     25
      22: goto          30
      25: aload_2
      26: invokevirtual #300                // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:()Landroid/graphics/drawable/Drawable;
      29: astore_1
      30: aload_1
      31: invokestatic  #305                // Method android/support/v4/b/a/a.f:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
      34: invokevirtual #308                // Method android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
      37: astore_2
      38: aload_2
      39: aload_0
      40: getfield      #310                // Field j:Landroid/content/res/ColorStateList;
      43: invokestatic  #313                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      46: aload_2
      47: iconst_0
      48: iconst_0
      49: aload_0
      50: getfield      #86                 // Field e:I
      53: aload_0
      54: getfield      #86                 // Field e:I
      57: invokevirtual #317                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      60: aload_2
      61: astore_1
      62: goto          129
      65: aload_0
      66: getfield      #319                // Field f:Z
      69: ifeq          129
      72: aload_0
      73: getfield      #321                // Field l:Landroid/graphics/drawable/Drawable;
      76: ifnonnull     124
      79: aload_0
      80: aload_0
      81: invokevirtual #322                // Method getResources:()Landroid/content/res/Resources;
      84: getstatic     #327                // Field android/support/design/a$e.navigation_empty_icon:I
      87: aload_0
      88: invokevirtual #157                // Method getContext:()Landroid/content/Context;
      91: invokevirtual #161                // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      94: invokestatic  #332                // Method android/support/v4/a/a/b.a:(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
      97: putfield      #321                // Field l:Landroid/graphics/drawable/Drawable;
     100: aload_0
     101: getfield      #321                // Field l:Landroid/graphics/drawable/Drawable;
     104: ifnull        124
     107: aload_0
     108: getfield      #321                // Field l:Landroid/graphics/drawable/Drawable;
     111: iconst_0
     112: iconst_0
     113: aload_0
     114: getfield      #86                 // Field e:I
     117: aload_0
     118: getfield      #86                 // Field e:I
     121: invokevirtual #317                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     124: aload_0
     125: getfield      #321                // Field l:Landroid/graphics/drawable/Drawable;
     128: astore_1
     129: aload_0
     130: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
     133: aload_1
     134: aconst_null
     135: aconst_null
     136: aconst_null
     137: invokestatic  #337                // Method android/support/v4/widget/m.a:(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
     140: return

  void setIconTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #310                // Field j:Landroid/content/res/ColorStateList;
       5: aload_0
       6: getfield      #310                // Field j:Landroid/content/res/ColorStateList;
       9: ifnull        17
      12: iconst_1
      13: istore_2
      14: goto          19
      17: iconst_0
      18: istore_2
      19: aload_0
      20: iload_2
      21: putfield      #289                // Field k:Z
      24: aload_0
      25: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
      28: ifnull        42
      31: aload_0
      32: aload_0
      33: getfield      #112                // Field i:Landroid/support/v7/view/menu/j;
      36: invokevirtual #122                // Method android/support/v7/view/menu/j.getIcon:()Landroid/graphics/drawable/Drawable;
      39: invokevirtual #247                // Method setIcon:(Landroid/graphics/drawable/Drawable;)V
      42: return

  public void setNeedsEmptyIcon(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #319                // Field f:Z
       5: return

  public void setTextAppearance(int);
    Code:
       0: aload_0
       1: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
       4: iload_1
       5: invokestatic  #344                // Method android/support/v4/widget/m.a:(Landroid/widget/TextView;I)V
       8: return

  public void setTextColor(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
       4: aload_1
       5: invokevirtual #347                // Method android/widget/CheckedTextView.setTextColor:(Landroid/content/res/ColorStateList;)V
       8: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #99                 // Field g:Landroid/widget/CheckedTextView;
       4: aload_1
       5: invokevirtual #350                // Method android/widget/CheckedTextView.setText:(Ljava/lang/CharSequence;)V
       8: return
}

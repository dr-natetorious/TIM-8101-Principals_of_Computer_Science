public class android.support.design.widget.AppBarLayout$ScrollingViewBehavior extends android.support.design.widget.h {
  public android.support.design.widget.AppBarLayout$ScrollingViewBehavior();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/design/widget/h."<init>":()V
       4: return

  public android.support.design.widget.AppBarLayout$ScrollingViewBehavior(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #15                 // Method android/support/design/widget/h."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #21                 // Field android/support/design/a$j.ScrollingViewBehavior_Layout:[I
      11: invokevirtual #27                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_0
      16: aload_1
      17: getstatic     #31                 // Field android/support/design/a$j.ScrollingViewBehavior_Layout_behavior_overlapTop:I
      20: iconst_0
      21: invokevirtual #37                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      24: invokevirtual #41                 // Method b:(I)V
      27: aload_1
      28: invokevirtual #44                 // Method android/content/res/TypedArray.recycle:()V
      31: return

  float a(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #6                  // class android/support/design/widget/AppBarLayout
       4: ifeq          60
       7: aload_1
       8: checkcast     #6                  // class android/support/design/widget/AppBarLayout
      11: astore_1
      12: aload_1
      13: invokevirtual #88                 // Method android/support/design/widget/AppBarLayout.getTotalScrollRange:()I
      16: istore_3
      17: aload_1
      18: invokevirtual #91                 // Method android/support/design/widget/AppBarLayout.getDownNestedPreScrollRange:()I
      21: istore        4
      23: aload_1
      24: invokestatic  #93                 // Method a:(Landroid/support/design/widget/AppBarLayout;)I
      27: istore_2
      28: iload         4
      30: ifeq          43
      33: iload_3
      34: iload_2
      35: iadd
      36: iload         4
      38: if_icmpgt     43
      41: fconst_0
      42: freturn
      43: iload_3
      44: iload         4
      46: isub
      47: istore_3
      48: iload_3
      49: ifeq          60
      52: iload_2
      53: i2f
      54: iload_3
      55: i2f
      56: fdiv
      57: fconst_1
      58: fadd
      59: freturn
      60: fconst_0
      61: freturn

  android.support.design.widget.AppBarLayout a(java.util.List<android.view.View>);
    Code:
       0: aload_1
       1: invokeinterface #99,  1           // InterfaceMethod java/util/List.size:()I
       6: istore_3
       7: iconst_0
       8: istore_2
       9: iload_2
      10: iload_3
      11: if_icmpge     47
      14: aload_1
      15: iload_2
      16: invokeinterface #103,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      21: checkcast     #64                 // class android/view/View
      24: astore        4
      26: aload         4
      28: instanceof    #6                  // class android/support/design/widget/AppBarLayout
      31: ifeq          40
      34: aload         4
      36: checkcast     #6                  // class android/support/design/widget/AppBarLayout
      39: areturn
      40: iload_2
      41: iconst_1
      42: iadd
      43: istore_2
      44: goto          9
      47: aconst_null
      48: areturn

  public boolean a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #108                // Method android/support/design/widget/h.a:(I)Z
       5: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #111                // Method android/support/design/widget/h.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)Z
       7: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: iload         6
      10: invokespecial #114                // Method android/support/design/widget/h.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
      13: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #120                // Method android/support/design/widget/CoordinatorLayout.c:(Landroid/view/View;)Ljava/util/List;
       6: invokevirtual #122                // Method a:(Ljava/util/List;)Landroid/support/design/widget/AppBarLayout;
       9: astore        5
      11: aload         5
      13: ifnull        67
      16: aload_3
      17: aload_2
      18: invokevirtual #125                // Method android/view/View.getLeft:()I
      21: aload_2
      22: invokevirtual #71                 // Method android/view/View.getTop:()I
      25: invokevirtual #131                // Method android/graphics/Rect.offset:(II)V
      28: aload_0
      29: getfield      #134                // Field a:Landroid/graphics/Rect;
      32: astore_2
      33: aload_2
      34: iconst_0
      35: iconst_0
      36: aload_1
      37: invokevirtual #137                // Method android/support/design/widget/CoordinatorLayout.getWidth:()I
      40: aload_1
      41: invokevirtual #140                // Method android/support/design/widget/CoordinatorLayout.getHeight:()I
      44: invokevirtual #144                // Method android/graphics/Rect.set:(IIII)V
      47: aload_2
      48: aload_3
      49: invokevirtual #148                // Method android/graphics/Rect.contains:(Landroid/graphics/Rect;)Z
      52: ifne          67
      55: aload         5
      57: iconst_0
      58: iload         4
      60: iconst_1
      61: ixor
      62: invokevirtual #151                // Method android/support/design/widget/AppBarLayout.a:(ZZ)V
      65: iconst_1
      66: ireturn
      67: iconst_0
      68: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View);
    Code:
       0: aload_3
       1: instanceof    #6                  // class android/support/design/widget/AppBarLayout
       4: ireturn

  public int b();
    Code:
       0: aload_0
       1: invokespecial #154                // Method android/support/design/widget/h.b:()I
       4: ireturn

  int b(android.view.View);
    Code:
       0: aload_1
       1: instanceof    #6                  // class android/support/design/widget/AppBarLayout
       4: ifeq          15
       7: aload_1
       8: checkcast     #6                  // class android/support/design/widget/AppBarLayout
      11: invokevirtual #88                 // Method android/support/design/widget/AppBarLayout.getTotalScrollRange:()I
      14: ireturn
      15: aload_0
      16: aload_1
      17: invokespecial #156                // Method android/support/design/widget/h.b:(Landroid/view/View;)I
      20: ireturn

  android.view.View b(java.util.List);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #122                // Method a:(Ljava/util/List;)Landroid/support/design/widget/AppBarLayout;
       5: areturn

  public boolean b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #159                // Method e:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V
       7: iconst_0
       8: ireturn
}

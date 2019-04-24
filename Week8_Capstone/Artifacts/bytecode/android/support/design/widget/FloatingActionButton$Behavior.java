public class android.support.design.widget.FloatingActionButton$Behavior extends android.support.design.widget.CoordinatorLayout$b<android.support.design.widget.FloatingActionButton> {
  public android.support.design.widget.FloatingActionButton$Behavior();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #20                 // Field c:Z
       9: return

  public android.support.design.widget.FloatingActionButton$Behavior(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #24                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #30                 // Field android/support/design/a$j.FloatingActionButton_Behavior_Layout:[I
      11: invokevirtual #36                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_0
      16: aload_1
      17: getstatic     #40                 // Field android/support/design/a$j.FloatingActionButton_Behavior_Layout_behavior_autoHide:I
      20: iconst_1
      21: invokevirtual #46                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      24: putfield      #20                 // Field c:Z
      27: aload_1
      28: invokevirtual #49                 // Method android/content/res/TypedArray.recycle:()V
      31: return

  public void a(android.support.design.widget.CoordinatorLayout$e);
    Code:
       0: aload_1
       1: getfield      #165                // Field android/support/design/widget/CoordinatorLayout$e.h:I
       4: ifne          13
       7: aload_1
       8: bipush        80
      10: putfield      #165                // Field android/support/design/widget/CoordinatorLayout$e.h:I
      13: return

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #169                // Method android/support/design/widget/CoordinatorLayout.c:(Landroid/view/View;)Ljava/util/List;
       5: astore        6
       7: aload         6
       9: invokeinterface #174,  1          // InterfaceMethod java/util/List.size:()I
      14: istore        5
      16: iconst_0
      17: istore        4
      19: iload         4
      21: iload         5
      23: if_icmpge     95
      26: aload         6
      28: iload         4
      30: invokeinterface #178,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      35: checkcast     #145                // class android/view/View
      38: astore        7
      40: aload         7
      42: instanceof    #132                // class android/support/design/widget/AppBarLayout
      45: ifeq          65
      48: aload_0
      49: aload_1
      50: aload         7
      52: checkcast     #132                // class android/support/design/widget/AppBarLayout
      55: aload_2
      56: invokespecial #180                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/support/design/widget/FloatingActionButton;)Z
      59: ifeq          86
      62: goto          95
      65: aload         7
      67: invokestatic  #182                // Method a:(Landroid/view/View;)Z
      70: ifeq          86
      73: aload_0
      74: aload         7
      76: aload_2
      77: invokespecial #184                // Method b:(Landroid/view/View;Landroid/support/design/widget/FloatingActionButton;)Z
      80: ifeq          86
      83: goto          95
      86: iload         4
      88: iconst_1
      89: iadd
      90: istore        4
      92: goto          19
      95: aload_1
      96: aload_2
      97: iload_3
      98: invokevirtual #186                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;I)V
     101: aload_0
     102: aload_1
     103: aload_2
     104: invokespecial #188                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/FloatingActionButton;)V
     107: iconst_1
     108: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton, android.graphics.Rect);
    Code:
       0: aload_2
       1: getfield      #52                 // Field android/support/design/widget/FloatingActionButton.c:Landroid/graphics/Rect;
       4: astore_1
       5: aload_3
       6: aload_2
       7: invokevirtual #84                 // Method android/support/design/widget/FloatingActionButton.getLeft:()I
      10: aload_1
      11: getfield      #90                 // Field android/graphics/Rect.left:I
      14: iadd
      15: aload_2
      16: invokevirtual #105                // Method android/support/design/widget/FloatingActionButton.getTop:()I
      19: aload_1
      20: getfield      #111                // Field android/graphics/Rect.top:I
      23: iadd
      24: aload_2
      25: invokevirtual #70                 // Method android/support/design/widget/FloatingActionButton.getRight:()I
      28: aload_1
      29: getfield      #81                 // Field android/graphics/Rect.right:I
      32: isub
      33: aload_2
      34: invokevirtual #93                 // Method android/support/design/widget/FloatingActionButton.getBottom:()I
      37: aload_1
      38: getfield      #102                // Field android/graphics/Rect.bottom:I
      41: isub
      42: invokevirtual #193                // Method android/graphics/Rect.set:(IIII)V
      45: iconst_1
      46: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.FloatingActionButton, android.view.View);
    Code:
       0: aload_3
       1: instanceof    #132                // class android/support/design/widget/AppBarLayout
       4: ifeq          21
       7: aload_0
       8: aload_1
       9: aload_3
      10: checkcast     #132                // class android/support/design/widget/AppBarLayout
      13: aload_2
      14: invokespecial #180                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/support/design/widget/FloatingActionButton;)Z
      17: pop
      18: goto          35
      21: aload_3
      22: invokestatic  #182                // Method a:(Landroid/view/View;)Z
      25: ifeq          35
      28: aload_0
      29: aload_3
      30: aload_2
      31: invokespecial #184                // Method b:(Landroid/view/View;Landroid/support/design/widget/FloatingActionButton;)Z
      34: pop
      35: iconst_0
      36: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/FloatingActionButton
       6: iload_3
       7: invokevirtual #197                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/FloatingActionButton;I)Z
      10: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/FloatingActionButton
       6: aload_3
       7: invokevirtual #200                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/FloatingActionButton;Landroid/graphics/Rect;)Z
      10: ireturn

  public boolean b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/FloatingActionButton
       6: aload_3
       7: invokevirtual #203                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/FloatingActionButton;Landroid/view/View;)Z
      10: ireturn
}

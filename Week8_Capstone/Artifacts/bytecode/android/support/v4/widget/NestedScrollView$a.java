class android.support.v4.widget.NestedScrollView$a extends android.support.v4.view.b {
  android.support.v4.widget.NestedScrollView$a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/v4/view/b."<init>":()V
       4: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #15                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_1
       7: checkcast     #6                  // class android/support/v4/widget/NestedScrollView
      10: astore_1
      11: aload_2
      12: ldc           #17                 // class android/widget/ScrollView
      14: invokevirtual #23                 // Method java/lang/Class.getName:()Ljava/lang/String;
      17: invokevirtual #29                 // Method android/support/v4/view/a/b.b:(Ljava/lang/CharSequence;)V
      20: aload_1
      21: invokevirtual #33                 // Method android/support/v4/widget/NestedScrollView.isEnabled:()Z
      24: ifeq          70
      27: aload_1
      28: invokevirtual #37                 // Method android/support/v4/widget/NestedScrollView.getScrollRange:()I
      31: istore_3
      32: iload_3
      33: ifle          70
      36: aload_2
      37: iconst_1
      38: invokevirtual #41                 // Method android/support/v4/view/a/b.k:(Z)V
      41: aload_1
      42: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
      45: ifle          55
      48: aload_2
      49: sipush        8192
      52: invokevirtual #47                 // Method android/support/v4/view/a/b.a:(I)V
      55: aload_1
      56: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
      59: iload_3
      60: if_icmpge     70
      63: aload_2
      64: sipush        4096
      67: invokevirtual #47                 // Method android/support/v4/view/a/b.a:(I)V
      70: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #50                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       6: aload_1
       7: checkcast     #6                  // class android/support/v4/widget/NestedScrollView
      10: astore_1
      11: aload_2
      12: ldc           #17                 // class android/widget/ScrollView
      14: invokevirtual #23                 // Method java/lang/Class.getName:()Ljava/lang/String;
      17: invokevirtual #55                 // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      20: aload_1
      21: invokevirtual #37                 // Method android/support/v4/widget/NestedScrollView.getScrollRange:()I
      24: ifle          32
      27: iconst_1
      28: istore_3
      29: goto          34
      32: iconst_0
      33: istore_3
      34: aload_2
      35: iload_3
      36: invokevirtual #58                 // Method android/view/accessibility/AccessibilityEvent.setScrollable:(Z)V
      39: aload_2
      40: aload_1
      41: invokevirtual #61                 // Method android/support/v4/widget/NestedScrollView.getScrollX:()I
      44: invokevirtual #64                 // Method android/view/accessibility/AccessibilityEvent.setScrollX:(I)V
      47: aload_2
      48: aload_1
      49: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
      52: invokevirtual #67                 // Method android/view/accessibility/AccessibilityEvent.setScrollY:(I)V
      55: aload_2
      56: aload_1
      57: invokevirtual #61                 // Method android/support/v4/widget/NestedScrollView.getScrollX:()I
      60: invokestatic  #72                 // Method android/support/v4/view/a/d.a:(Landroid/view/accessibility/AccessibilityRecord;I)V
      63: aload_2
      64: aload_1
      65: invokevirtual #37                 // Method android/support/v4/widget/NestedScrollView.getScrollRange:()I
      68: invokestatic  #74                 // Method android/support/v4/view/a/d.b:(Landroid/view/accessibility/AccessibilityRecord;I)V
      71: return

  public boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #77                 // Method android/support/v4/view/b.a:(Landroid/view/View;ILandroid/os/Bundle;)Z
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: aload_1
      13: checkcast     #6                  // class android/support/v4/widget/NestedScrollView
      16: astore_1
      17: aload_1
      18: invokevirtual #33                 // Method android/support/v4/widget/NestedScrollView.isEnabled:()Z
      21: ifne          26
      24: iconst_0
      25: ireturn
      26: iload_2
      27: sipush        4096
      30: if_icmpeq     94
      33: iload_2
      34: sipush        8192
      37: if_icmpeq     42
      40: iconst_0
      41: ireturn
      42: aload_1
      43: invokevirtual #80                 // Method android/support/v4/widget/NestedScrollView.getHeight:()I
      46: istore_2
      47: aload_1
      48: invokevirtual #83                 // Method android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
      51: istore        4
      53: aload_1
      54: invokevirtual #86                 // Method android/support/v4/widget/NestedScrollView.getPaddingTop:()I
      57: istore        5
      59: aload_1
      60: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
      63: iload_2
      64: iload         4
      66: isub
      67: iload         5
      69: isub
      70: isub
      71: iconst_0
      72: invokestatic  #92                 // Method java/lang/Math.max:(II)I
      75: istore_2
      76: iload_2
      77: aload_1
      78: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
      81: if_icmpeq     92
      84: aload_1
      85: iconst_0
      86: iload_2
      87: invokevirtual #96                 // Method android/support/v4/widget/NestedScrollView.c:(II)V
      90: iconst_1
      91: ireturn
      92: iconst_0
      93: ireturn
      94: aload_1
      95: invokevirtual #80                 // Method android/support/v4/widget/NestedScrollView.getHeight:()I
      98: istore_2
      99: aload_1
     100: invokevirtual #83                 // Method android/support/v4/widget/NestedScrollView.getPaddingBottom:()I
     103: istore        4
     105: aload_1
     106: invokevirtual #86                 // Method android/support/v4/widget/NestedScrollView.getPaddingTop:()I
     109: istore        5
     111: aload_1
     112: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
     115: iload_2
     116: iload         4
     118: isub
     119: iload         5
     121: isub
     122: iadd
     123: aload_1
     124: invokevirtual #37                 // Method android/support/v4/widget/NestedScrollView.getScrollRange:()I
     127: invokestatic  #99                 // Method java/lang/Math.min:(II)I
     130: istore_2
     131: iload_2
     132: aload_1
     133: invokevirtual #44                 // Method android/support/v4/widget/NestedScrollView.getScrollY:()I
     136: if_icmpeq     147
     139: aload_1
     140: iconst_0
     141: iload_2
     142: invokevirtual #96                 // Method android/support/v4/widget/NestedScrollView.c:(II)V
     145: iconst_1
     146: ireturn
     147: iconst_0
     148: ireturn
}

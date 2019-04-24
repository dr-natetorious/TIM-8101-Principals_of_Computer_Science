class android.support.v4.view.v$d extends android.support.v4.view.b {
  final android.support.v4.view.v a;

  android.support.v4.view.v$d(android.support.v4.view.v);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v4/view/v;
       5: aload_0
       6: invokespecial #16                 // Method android/support/v4/view/b."<init>":()V
       9: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #32                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_2
       7: ldc           #6                  // class android/support/v4/view/v
       9: invokevirtual #38                 // Method java/lang/Class.getName:()Ljava/lang/String;
      12: invokevirtual #43                 // Method android/support/v4/view/a/b.b:(Ljava/lang/CharSequence;)V
      15: aload_2
      16: aload_0
      17: invokespecial #45                 // Method b:()Z
      20: invokevirtual #49                 // Method android/support/v4/view/a/b.k:(Z)V
      23: aload_0
      24: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      27: iconst_1
      28: invokevirtual #53                 // Method android/support/v4/view/v.canScrollHorizontally:(I)Z
      31: ifeq          41
      34: aload_2
      35: sipush        4096
      38: invokevirtual #56                 // Method android/support/v4/view/a/b.a:(I)V
      41: aload_0
      42: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      45: iconst_m1
      46: invokevirtual #53                 // Method android/support/v4/view/v.canScrollHorizontally:(I)Z
      49: ifeq          59
      52: aload_2
      53: sipush        8192
      56: invokevirtual #56                 // Method android/support/v4/view/a/b.a:(I)V
      59: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #59                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       6: aload_2
       7: ldc           #6                  // class android/support/v4/view/v
       9: invokevirtual #38                 // Method java/lang/Class.getName:()Ljava/lang/String;
      12: invokevirtual #64                 // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      15: aload_2
      16: aload_0
      17: invokespecial #45                 // Method b:()Z
      20: invokevirtual #67                 // Method android/view/accessibility/AccessibilityEvent.setScrollable:(Z)V
      23: aload_2
      24: invokevirtual #70                 // Method android/view/accessibility/AccessibilityEvent.getEventType:()I
      27: sipush        4096
      30: if_icmpne     79
      33: aload_0
      34: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      37: getfield      #23                 // Field android/support/v4/view/v.mAdapter:Landroid/support/v4/view/q;
      40: ifnull        79
      43: aload_2
      44: aload_0
      45: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      48: getfield      #23                 // Field android/support/v4/view/v.mAdapter:Landroid/support/v4/view/q;
      51: invokevirtual #29                 // Method android/support/v4/view/q.getCount:()I
      54: invokevirtual #73                 // Method android/view/accessibility/AccessibilityEvent.setItemCount:(I)V
      57: aload_2
      58: aload_0
      59: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      62: getfield      #77                 // Field android/support/v4/view/v.mCurItem:I
      65: invokevirtual #80                 // Method android/view/accessibility/AccessibilityEvent.setFromIndex:(I)V
      68: aload_2
      69: aload_0
      70: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      73: getfield      #77                 // Field android/support/v4/view/v.mCurItem:I
      76: invokevirtual #83                 // Method android/view/accessibility/AccessibilityEvent.setToIndex:(I)V
      79: return

  public boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #86                 // Method android/support/v4/view/b.a:(Landroid/view/View;ILandroid/os/Bundle;)Z
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: iload_2
      13: sipush        4096
      16: if_icmpeq     63
      19: iload_2
      20: sipush        8192
      23: if_icmpeq     28
      26: iconst_0
      27: ireturn
      28: aload_0
      29: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      32: iconst_m1
      33: invokevirtual #53                 // Method android/support/v4/view/v.canScrollHorizontally:(I)Z
      36: ifeq          61
      39: aload_0
      40: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      43: astore_1
      44: aload_0
      45: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      48: getfield      #77                 // Field android/support/v4/view/v.mCurItem:I
      51: iconst_1
      52: isub
      53: istore_2
      54: aload_1
      55: iload_2
      56: invokevirtual #89                 // Method android/support/v4/view/v.setCurrentItem:(I)V
      59: iconst_1
      60: ireturn
      61: iconst_0
      62: ireturn
      63: aload_0
      64: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      67: iconst_1
      68: invokevirtual #53                 // Method android/support/v4/view/v.canScrollHorizontally:(I)Z
      71: ifeq          92
      74: aload_0
      75: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      78: astore_1
      79: aload_0
      80: getfield      #13                 // Field a:Landroid/support/v4/view/v;
      83: getfield      #77                 // Field android/support/v4/view/v.mCurItem:I
      86: iconst_1
      87: iadd
      88: istore_2
      89: goto          54
      92: iconst_0
      93: ireturn
}

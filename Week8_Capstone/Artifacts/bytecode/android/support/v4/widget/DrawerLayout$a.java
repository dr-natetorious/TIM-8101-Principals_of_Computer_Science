class android.support.v4.widget.DrawerLayout$a extends android.support.v4.view.b {
  final android.support.v4.widget.DrawerLayout a;

  android.support.v4.widget.DrawerLayout$a(android.support.v4.widget.DrawerLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       5: aload_0
       6: invokespecial #17                 // Method android/support/v4/view/b."<init>":()V
       9: aload_0
      10: new           #19                 // class android/graphics/Rect
      13: dup
      14: invokespecial #20                 // Method android/graphics/Rect."<init>":()V
      17: putfield      #22                 // Field c:Landroid/graphics/Rect;
      20: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: getstatic     #122                // Field android/support/v4/widget/DrawerLayout.b:Z
       3: ifeq          15
       6: aload_0
       7: aload_1
       8: aload_2
       9: invokespecial #124                // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
      12: goto          73
      15: aload_2
      16: invokestatic  #127                // Method android/support/v4/view/a/b.a:(Landroid/support/v4/view/a/b;)Landroid/support/v4/view/a/b;
      19: astore_3
      20: aload_0
      21: aload_1
      22: aload_3
      23: invokespecial #124                // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
      26: aload_2
      27: aload_1
      28: invokevirtual #129                // Method android/support/v4/view/a/b.a:(Landroid/view/View;)V
      31: aload_1
      32: invokestatic  #134                // Method android/support/v4/view/s.f:(Landroid/view/View;)Landroid/view/ViewParent;
      35: astore        4
      37: aload         4
      39: instanceof    #136                // class android/view/View
      42: ifeq          54
      45: aload_2
      46: aload         4
      48: checkcast     #136                // class android/view/View
      51: invokevirtual #138                // Method android/support/v4/view/a/b.c:(Landroid/view/View;)V
      54: aload_0
      55: aload_2
      56: aload_3
      57: invokespecial #140                // Method a:(Landroid/support/v4/view/a/b;Landroid/support/v4/view/a/b;)V
      60: aload_3
      61: invokevirtual #143                // Method android/support/v4/view/a/b.s:()V
      64: aload_0
      65: aload_2
      66: aload_1
      67: checkcast     #105                // class android/view/ViewGroup
      70: invokespecial #145                // Method a:(Landroid/support/v4/view/a/b;Landroid/view/ViewGroup;)V
      73: aload_2
      74: ldc           #6                  // class android/support/v4/widget/DrawerLayout
      76: invokevirtual #151                // Method java/lang/Class.getName:()Ljava/lang/String;
      79: invokevirtual #57                 // Method android/support/v4/view/a/b.b:(Ljava/lang/CharSequence;)V
      82: aload_2
      83: iconst_0
      84: invokevirtual #77                 // Method android/support/v4/view/a/b.c:(Z)V
      87: aload_2
      88: iconst_0
      89: invokevirtual #82                 // Method android/support/v4/view/a/b.d:(Z)V
      92: aload_2
      93: getstatic     #156                // Field android/support/v4/view/a/b$a.a:Landroid/support/v4/view/a/b$a;
      96: invokevirtual #159                // Method android/support/v4/view/a/b.a:(Landroid/support/v4/view/a/b$a;)Z
      99: pop
     100: aload_2
     101: getstatic     #161                // Field android/support/v4/view/a/b$a.b:Landroid/support/v4/view/a/b$a;
     104: invokevirtual #159                // Method android/support/v4/view/a/b.a:(Landroid/support/v4/view/a/b$a;)Z
     107: pop
     108: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #164                // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       6: aload_2
       7: ldc           #6                  // class android/support/v4/widget/DrawerLayout
       9: invokevirtual #151                // Method java/lang/Class.getName:()Ljava/lang/String;
      12: invokevirtual #169                // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      15: return

  public boolean a(android.view.ViewGroup, android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #122                // Field android/support/v4/widget/DrawerLayout.b:Z
       3: ifne          18
       6: aload_2
       7: invokestatic  #115                // Method android/support/v4/widget/DrawerLayout.l:(Landroid/view/View;)Z
      10: ifeq          16
      13: goto          18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: aload_1
      20: aload_2
      21: aload_3
      22: invokespecial #172                // Method android/support/v4/view/b.a:(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
      25: ireturn

  public boolean c(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_2
       1: invokevirtual #176                // Method android/view/accessibility/AccessibilityEvent.getEventType:()I
       4: bipush        32
       6: if_icmpne     58
       9: aload_2
      10: invokevirtual #180                // Method android/view/accessibility/AccessibilityEvent.getText:()Ljava/util/List;
      13: astore_1
      14: aload_0
      15: getfield      #14                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      18: invokevirtual #183                // Method android/support/v4/widget/DrawerLayout.c:()Landroid/view/View;
      21: astore_2
      22: aload_2
      23: ifnull        56
      26: aload_0
      27: getfield      #14                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      30: aload_2
      31: invokevirtual #186                // Method android/support/v4/widget/DrawerLayout.e:(Landroid/view/View;)I
      34: istore_3
      35: aload_0
      36: getfield      #14                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      39: iload_3
      40: invokevirtual #189                // Method android/support/v4/widget/DrawerLayout.b:(I)Ljava/lang/CharSequence;
      43: astore_2
      44: aload_2
      45: ifnull        56
      48: aload_1
      49: aload_2
      50: invokeinterface #195,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      55: pop
      56: iconst_1
      57: ireturn
      58: aload_0
      59: aload_1
      60: aload_2
      61: invokespecial #197                // Method android/support/v4/view/b.c:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
      64: ireturn
}

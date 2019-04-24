class android.support.v4.app.w extends android.support.v4.app.x {
  android.support.v4.app.w();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/support/v4/app/x."<init>":()V
       4: return

  public java.lang.Object a(java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: new           #37                 // class android/transition/TransitionSet
       3: dup
       4: invokespecial #38                 // Method android/transition/TransitionSet."<init>":()V
       7: astore        4
       9: aload_1
      10: ifnull        23
      13: aload         4
      15: aload_1
      16: checkcast     #21                 // class android/transition/Transition
      19: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      22: pop
      23: aload_2
      24: ifnull        37
      27: aload         4
      29: aload_2
      30: checkcast     #21                 // class android/transition/Transition
      33: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      36: pop
      37: aload_3
      38: ifnull        51
      41: aload         4
      43: aload_3
      44: checkcast     #21                 // class android/transition/Transition
      47: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      50: pop
      51: aload         4
      53: areturn

  public void a(android.view.ViewGroup, java.lang.Object);
    Code:
       0: aload_1
       1: aload_2
       2: checkcast     #21                 // class android/transition/Transition
       5: invokestatic  #49                 // Method android/transition/TransitionManager.beginDelayedTransition:(Landroid/view/ViewGroup;Landroid/transition/Transition;)V
       8: return

  public void a(java.lang.Object, android.graphics.Rect);
    Code:
       0: aload_1
       1: ifnull        20
       4: aload_1
       5: checkcast     #21                 // class android/transition/Transition
       8: new           #12                 // class android/support/v4/app/w$4
      11: dup
      12: aload_0
      13: aload_2
      14: invokespecial #53                 // Method android/support/v4/app/w$4."<init>":(Landroid/support/v4/app/w;Landroid/graphics/Rect;)V
      17: invokevirtual #57                 // Method android/transition/Transition.setEpicenterCallback:(Landroid/transition/Transition$EpicenterCallback;)V
      20: return

  public void a(java.lang.Object, android.view.View);
    Code:
       0: aload_2
       1: ifnull        36
       4: aload_1
       5: checkcast     #21                 // class android/transition/Transition
       8: astore_1
       9: new           #60                 // class android/graphics/Rect
      12: dup
      13: invokespecial #61                 // Method android/graphics/Rect."<init>":()V
      16: astore_3
      17: aload_0
      18: aload_2
      19: aload_3
      20: invokevirtual #64                 // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      23: aload_1
      24: new           #6                  // class android/support/v4/app/w$1
      27: dup
      28: aload_0
      29: aload_3
      30: invokespecial #65                 // Method android/support/v4/app/w$1."<init>":(Landroid/support/v4/app/w;Landroid/graphics/Rect;)V
      33: invokevirtual #57                 // Method android/transition/Transition.setEpicenterCallback:(Landroid/transition/Transition$EpicenterCallback;)V
      36: return

  public void a(java.lang.Object, android.view.View, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #37                 // class android/transition/TransitionSet
       4: astore_1
       5: aload_1
       6: invokevirtual #69                 // Method android/transition/TransitionSet.getTargets:()Ljava/util/List;
       9: astore        6
      11: aload         6
      13: invokeinterface #74,  1           // InterfaceMethod java/util/List.clear:()V
      18: aload_3
      19: invokevirtual #80                 // Method java/util/ArrayList.size:()I
      22: istore        5
      24: iconst_0
      25: istore        4
      27: iload         4
      29: iload         5
      31: if_icmpge     57
      34: aload         6
      36: aload_3
      37: iload         4
      39: invokevirtual #84                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      42: checkcast     #86                 // class android/view/View
      45: invokestatic  #89                 // Method a:(Ljava/util/List;Landroid/view/View;)V
      48: iload         4
      50: iconst_1
      51: iadd
      52: istore        4
      54: goto          27
      57: aload         6
      59: aload_2
      60: invokeinterface #93,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      65: pop
      66: aload_3
      67: aload_2
      68: invokevirtual #94                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      71: pop
      72: aload_0
      73: aload_1
      74: aload_3
      75: invokevirtual #97                 // Method a:(Ljava/lang/Object;Ljava/util/ArrayList;)V
      78: return

  public void a(java.lang.Object, java.lang.Object, java.util.ArrayList<android.view.View>, java.lang.Object, java.util.ArrayList<android.view.View>, java.lang.Object, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/transition/Transition
       4: new           #10                 // class android/support/v4/app/w$3
       7: dup
       8: aload_0
       9: aload_2
      10: aload_3
      11: aload         4
      13: aload         5
      15: aload         6
      17: aload         7
      19: invokespecial #103                // Method android/support/v4/app/w$3."<init>":(Landroid/support/v4/app/w;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
      22: invokevirtual #107                // Method android/transition/Transition.addListener:(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
      25: pop
      26: return

  public void a(java.lang.Object, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/transition/Transition
       4: astore_1
       5: aload_1
       6: ifnonnull     10
       9: return
      10: aload_1
      11: instanceof    #37                 // class android/transition/TransitionSet
      14: istore        6
      16: iconst_0
      17: istore        4
      19: iconst_0
      20: istore_3
      21: iload         6
      23: ifeq          60
      26: aload_1
      27: checkcast     #37                 // class android/transition/TransitionSet
      30: astore_1
      31: aload_1
      32: invokevirtual #111                // Method android/transition/TransitionSet.getTransitionCount:()I
      35: istore        4
      37: iload_3
      38: iload         4
      40: if_icmpge     112
      43: aload_0
      44: aload_1
      45: iload_3
      46: invokevirtual #115                // Method android/transition/TransitionSet.getTransitionAt:(I)Landroid/transition/Transition;
      49: aload_2
      50: invokevirtual #97                 // Method a:(Ljava/lang/Object;Ljava/util/ArrayList;)V
      53: iload_3
      54: iconst_1
      55: iadd
      56: istore_3
      57: goto          37
      60: aload_1
      61: invokestatic  #117                // Method a:(Landroid/transition/Transition;)Z
      64: ifne          112
      67: aload_1
      68: invokevirtual #118                // Method android/transition/Transition.getTargets:()Ljava/util/List;
      71: invokestatic  #28                 // Method a:(Ljava/util/List;)Z
      74: ifeq          112
      77: aload_2
      78: invokevirtual #80                 // Method java/util/ArrayList.size:()I
      81: istore        5
      83: iload         4
      85: istore_3
      86: iload_3
      87: iload         5
      89: if_icmpge     112
      92: aload_1
      93: aload_2
      94: iload_3
      95: invokevirtual #84                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      98: checkcast     #86                 // class android/view/View
     101: invokevirtual #122                // Method android/transition/Transition.addTarget:(Landroid/view/View;)Landroid/transition/Transition;
     104: pop
     105: iload_3
     106: iconst_1
     107: iadd
     108: istore_3
     109: goto          86
     112: return

  public void a(java.lang.Object, java.util.ArrayList<android.view.View>, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #37                 // class android/transition/TransitionSet
       4: astore_1
       5: aload_1
       6: ifnull        36
       9: aload_1
      10: invokevirtual #69                 // Method android/transition/TransitionSet.getTargets:()Ljava/util/List;
      13: invokeinterface #74,  1           // InterfaceMethod java/util/List.clear:()V
      18: aload_1
      19: invokevirtual #69                 // Method android/transition/TransitionSet.getTargets:()Ljava/util/List;
      22: aload_3
      23: invokeinterface #128,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      28: pop
      29: aload_0
      30: aload_1
      31: aload_2
      32: aload_3
      33: invokevirtual #131                // Method b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      36: return

  public boolean a(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #21                 // class android/transition/Transition
       4: ireturn

  public java.lang.Object b(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        12
       4: aload_1
       5: checkcast     #21                 // class android/transition/Transition
       8: invokevirtual #137                // Method android/transition/Transition.clone:()Landroid/transition/Transition;
      11: areturn
      12: aconst_null
      13: areturn

  public java.lang.Object b(java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/transition/Transition
       4: astore_1
       5: aload_2
       6: checkcast     #21                 // class android/transition/Transition
       9: astore_2
      10: aload_3
      11: checkcast     #21                 // class android/transition/Transition
      14: astore_3
      15: aload_1
      16: ifnull        46
      19: aload_2
      20: ifnull        46
      23: new           #37                 // class android/transition/TransitionSet
      26: dup
      27: invokespecial #38                 // Method android/transition/TransitionSet."<init>":()V
      30: aload_1
      31: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      34: aload_2
      35: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      38: iconst_1
      39: invokevirtual #141                // Method android/transition/TransitionSet.setOrdering:(I)Landroid/transition/TransitionSet;
      42: astore_1
      43: goto          64
      46: aload_1
      47: ifnull        53
      50: goto          64
      53: aload_2
      54: ifnull        62
      57: aload_2
      58: astore_1
      59: goto          64
      62: aconst_null
      63: astore_1
      64: aload_3
      65: ifnull        94
      68: new           #37                 // class android/transition/TransitionSet
      71: dup
      72: invokespecial #38                 // Method android/transition/TransitionSet."<init>":()V
      75: astore_2
      76: aload_1
      77: ifnull        86
      80: aload_2
      81: aload_1
      82: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      85: pop
      86: aload_2
      87: aload_3
      88: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      91: pop
      92: aload_2
      93: areturn
      94: aload_1
      95: areturn

  public void b(java.lang.Object, android.view.View);
    Code:
       0: aload_1
       1: ifnull        13
       4: aload_1
       5: checkcast     #21                 // class android/transition/Transition
       8: aload_2
       9: invokevirtual #122                // Method android/transition/Transition.addTarget:(Landroid/view/View;)Landroid/transition/Transition;
      12: pop
      13: return

  public void b(java.lang.Object, android.view.View, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/transition/Transition
       4: new           #8                  // class android/support/v4/app/w$2
       7: dup
       8: aload_0
       9: aload_2
      10: aload_3
      11: invokespecial #144                // Method android/support/v4/app/w$2."<init>":(Landroid/support/v4/app/w;Landroid/view/View;Ljava/util/ArrayList;)V
      14: invokevirtual #107                // Method android/transition/Transition.addListener:(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
      17: pop
      18: return

  public void b(java.lang.Object, java.util.ArrayList<android.view.View>, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/transition/Transition
       4: astore_1
       5: aload_1
       6: instanceof    #37                 // class android/transition/TransitionSet
       9: istore        6
      11: iconst_0
      12: istore        5
      14: iconst_0
      15: istore        4
      17: iload         6
      19: ifeq          61
      22: aload_1
      23: checkcast     #37                 // class android/transition/TransitionSet
      26: astore_1
      27: aload_1
      28: invokevirtual #111                // Method android/transition/TransitionSet.getTransitionCount:()I
      31: istore        5
      33: iload         4
      35: iload         5
      37: if_icmpge     186
      40: aload_0
      41: aload_1
      42: iload         4
      44: invokevirtual #115                // Method android/transition/TransitionSet.getTransitionAt:(I)Landroid/transition/Transition;
      47: aload_2
      48: aload_3
      49: invokevirtual #131                // Method b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      52: iload         4
      54: iconst_1
      55: iadd
      56: istore        4
      58: goto          33
      61: aload_1
      62: invokestatic  #117                // Method a:(Landroid/transition/Transition;)Z
      65: ifne          186
      68: aload_1
      69: invokevirtual #118                // Method android/transition/Transition.getTargets:()Ljava/util/List;
      72: astore        7
      74: aload         7
      76: ifnull        186
      79: aload         7
      81: invokeinterface #145,  1          // InterfaceMethod java/util/List.size:()I
      86: aload_2
      87: invokevirtual #80                 // Method java/util/ArrayList.size:()I
      90: if_icmpne     186
      93: aload         7
      95: aload_2
      96: invokeinterface #148,  2          // InterfaceMethod java/util/List.containsAll:(Ljava/util/Collection;)Z
     101: ifeq          186
     104: aload_3
     105: ifnonnull     114
     108: iconst_0
     109: istore        4
     111: goto          120
     114: aload_3
     115: invokevirtual #80                 // Method java/util/ArrayList.size:()I
     118: istore        4
     120: iload         5
     122: iload         4
     124: if_icmpge     150
     127: aload_1
     128: aload_3
     129: iload         5
     131: invokevirtual #84                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     134: checkcast     #86                 // class android/view/View
     137: invokevirtual #122                // Method android/transition/Transition.addTarget:(Landroid/view/View;)Landroid/transition/Transition;
     140: pop
     141: iload         5
     143: iconst_1
     144: iadd
     145: istore        5
     147: goto          120
     150: aload_2
     151: invokevirtual #80                 // Method java/util/ArrayList.size:()I
     154: iconst_1
     155: isub
     156: istore        4
     158: iload         4
     160: iflt          186
     163: aload_1
     164: aload_2
     165: iload         4
     167: invokevirtual #84                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     170: checkcast     #86                 // class android/view/View
     173: invokevirtual #151                // Method android/transition/Transition.removeTarget:(Landroid/view/View;)Landroid/transition/Transition;
     176: pop
     177: iload         4
     179: iconst_1
     180: isub
     181: istore        4
     183: goto          158
     186: return

  public java.lang.Object c(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: new           #37                 // class android/transition/TransitionSet
       9: dup
      10: invokespecial #38                 // Method android/transition/TransitionSet."<init>":()V
      13: astore_2
      14: aload_2
      15: aload_1
      16: checkcast     #21                 // class android/transition/Transition
      19: invokevirtual #42                 // Method android/transition/TransitionSet.addTransition:(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
      22: pop
      23: aload_2
      24: areturn

  public void c(java.lang.Object, android.view.View);
    Code:
       0: aload_1
       1: ifnull        13
       4: aload_1
       5: checkcast     #21                 // class android/transition/Transition
       8: aload_2
       9: invokevirtual #151                // Method android/transition/Transition.removeTarget:(Landroid/view/View;)Landroid/transition/Transition;
      12: pop
      13: return
}

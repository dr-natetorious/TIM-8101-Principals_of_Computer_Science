public class android.support.transition.FragmentTransitionSupport extends android.support.v4.app.x {
  public android.support.transition.FragmentTransitionSupport();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method android/support/v4/app/x."<init>":()V
       4: return

  public java.lang.Object a(java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: new           #37                 // class android/support/transition/y
       3: dup
       4: invokespecial #38                 // Method android/support/transition/y."<init>":()V
       7: astore        4
       9: aload_1
      10: ifnull        23
      13: aload         4
      15: aload_1
      16: checkcast     #21                 // class android/support/transition/u
      19: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      22: pop
      23: aload_2
      24: ifnull        37
      27: aload         4
      29: aload_2
      30: checkcast     #21                 // class android/support/transition/u
      33: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      36: pop
      37: aload_3
      38: ifnull        51
      41: aload         4
      43: aload_3
      44: checkcast     #21                 // class android/support/transition/u
      47: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      50: pop
      51: aload         4
      53: areturn

  public void a(android.view.ViewGroup, java.lang.Object);
    Code:
       0: aload_1
       1: aload_2
       2: checkcast     #21                 // class android/support/transition/u
       5: invokestatic  #48                 // Method android/support/transition/w.a:(Landroid/view/ViewGroup;Landroid/support/transition/u;)V
       8: return

  public void a(java.lang.Object, android.graphics.Rect);
    Code:
       0: aload_1
       1: ifnull        20
       4: aload_1
       5: checkcast     #21                 // class android/support/transition/u
       8: new           #12                 // class android/support/transition/FragmentTransitionSupport$4
      11: dup
      12: aload_0
      13: aload_2
      14: invokespecial #52                 // Method android/support/transition/FragmentTransitionSupport$4."<init>":(Landroid/support/transition/FragmentTransitionSupport;Landroid/graphics/Rect;)V
      17: invokevirtual #55                 // Method android/support/transition/u.a:(Landroid/support/transition/u$b;)V
      20: return

  public void a(java.lang.Object, android.view.View);
    Code:
       0: aload_2
       1: ifnull        36
       4: aload_1
       5: checkcast     #21                 // class android/support/transition/u
       8: astore_1
       9: new           #58                 // class android/graphics/Rect
      12: dup
      13: invokespecial #59                 // Method android/graphics/Rect."<init>":()V
      16: astore_3
      17: aload_0
      18: aload_2
      19: aload_3
      20: invokevirtual #62                 // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      23: aload_1
      24: new           #6                  // class android/support/transition/FragmentTransitionSupport$1
      27: dup
      28: aload_0
      29: aload_3
      30: invokespecial #63                 // Method android/support/transition/FragmentTransitionSupport$1."<init>":(Landroid/support/transition/FragmentTransitionSupport;Landroid/graphics/Rect;)V
      33: invokevirtual #55                 // Method android/support/transition/u.a:(Landroid/support/transition/u$b;)V
      36: return

  public void a(java.lang.Object, android.view.View, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #37                 // class android/support/transition/y
       4: astore_1
       5: aload_1
       6: invokevirtual #67                 // Method android/support/transition/y.g:()Ljava/util/List;
       9: astore        6
      11: aload         6
      13: invokeinterface #72,  1           // InterfaceMethod java/util/List.clear:()V
      18: aload_3
      19: invokevirtual #78                 // Method java/util/ArrayList.size:()I
      22: istore        5
      24: iconst_0
      25: istore        4
      27: iload         4
      29: iload         5
      31: if_icmpge     57
      34: aload         6
      36: aload_3
      37: iload         4
      39: invokevirtual #82                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      42: checkcast     #84                 // class android/view/View
      45: invokestatic  #87                 // Method a:(Ljava/util/List;Landroid/view/View;)V
      48: iload         4
      50: iconst_1
      51: iadd
      52: istore        4
      54: goto          27
      57: aload         6
      59: aload_2
      60: invokeinterface #91,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      65: pop
      66: aload_3
      67: aload_2
      68: invokevirtual #92                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      71: pop
      72: aload_0
      73: aload_1
      74: aload_3
      75: invokevirtual #95                 // Method a:(Ljava/lang/Object;Ljava/util/ArrayList;)V
      78: return

  public void a(java.lang.Object, java.lang.Object, java.util.ArrayList<android.view.View>, java.lang.Object, java.util.ArrayList<android.view.View>, java.lang.Object, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/support/transition/u
       4: new           #10                 // class android/support/transition/FragmentTransitionSupport$3
       7: dup
       8: aload_0
       9: aload_2
      10: aload_3
      11: aload         4
      13: aload         5
      15: aload         6
      17: aload         7
      19: invokespecial #101                // Method android/support/transition/FragmentTransitionSupport$3."<init>":(Landroid/support/transition/FragmentTransitionSupport;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
      22: invokevirtual #104                // Method android/support/transition/u.a:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      25: pop
      26: return

  public void a(java.lang.Object, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/support/transition/u
       4: astore_1
       5: aload_1
       6: ifnonnull     10
       9: return
      10: aload_1
      11: instanceof    #37                 // class android/support/transition/y
      14: istore        6
      16: iconst_0
      17: istore        4
      19: iconst_0
      20: istore_3
      21: iload         6
      23: ifeq          60
      26: aload_1
      27: checkcast     #37                 // class android/support/transition/y
      30: astore_1
      31: aload_1
      32: invokevirtual #108                // Method android/support/transition/y.o:()I
      35: istore        4
      37: iload_3
      38: iload         4
      40: if_icmpge     112
      43: aload_0
      44: aload_1
      45: iload_3
      46: invokevirtual #111                // Method android/support/transition/y.b:(I)Landroid/support/transition/u;
      49: aload_2
      50: invokevirtual #95                 // Method a:(Ljava/lang/Object;Ljava/util/ArrayList;)V
      53: iload_3
      54: iconst_1
      55: iadd
      56: istore_3
      57: goto          37
      60: aload_1
      61: invokestatic  #113                // Method a:(Landroid/support/transition/u;)Z
      64: ifne          112
      67: aload_1
      68: invokevirtual #114                // Method android/support/transition/u.g:()Ljava/util/List;
      71: invokestatic  #28                 // Method a:(Ljava/util/List;)Z
      74: ifeq          112
      77: aload_2
      78: invokevirtual #78                 // Method java/util/ArrayList.size:()I
      81: istore        5
      83: iload         4
      85: istore_3
      86: iload_3
      87: iload         5
      89: if_icmpge     112
      92: aload_1
      93: aload_2
      94: iload_3
      95: invokevirtual #82                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      98: checkcast     #84                 // class android/view/View
     101: invokevirtual #117                // Method android/support/transition/u.b:(Landroid/view/View;)Landroid/support/transition/u;
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
       1: checkcast     #37                 // class android/support/transition/y
       4: astore_1
       5: aload_1
       6: ifnull        36
       9: aload_1
      10: invokevirtual #67                 // Method android/support/transition/y.g:()Ljava/util/List;
      13: invokeinterface #72,  1           // InterfaceMethod java/util/List.clear:()V
      18: aload_1
      19: invokevirtual #67                 // Method android/support/transition/y.g:()Ljava/util/List;
      22: aload_3
      23: invokeinterface #123,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      28: pop
      29: aload_0
      30: aload_1
      31: aload_2
      32: aload_3
      33: invokevirtual #125                // Method b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      36: return

  public boolean a(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #21                 // class android/support/transition/u
       4: ireturn

  public java.lang.Object b(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        12
       4: aload_1
       5: checkcast     #21                 // class android/support/transition/u
       8: invokevirtual #131                // Method android/support/transition/u.m:()Landroid/support/transition/u;
      11: areturn
      12: aconst_null
      13: areturn

  public java.lang.Object b(java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/support/transition/u
       4: astore_1
       5: aload_2
       6: checkcast     #21                 // class android/support/transition/u
       9: astore_2
      10: aload_3
      11: checkcast     #21                 // class android/support/transition/u
      14: astore_3
      15: aload_1
      16: ifnull        46
      19: aload_2
      20: ifnull        46
      23: new           #37                 // class android/support/transition/y
      26: dup
      27: invokespecial #38                 // Method android/support/transition/y."<init>":()V
      30: aload_1
      31: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      34: aload_2
      35: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      38: iconst_1
      39: invokevirtual #134                // Method android/support/transition/y.a:(I)Landroid/support/transition/y;
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
      68: new           #37                 // class android/support/transition/y
      71: dup
      72: invokespecial #38                 // Method android/support/transition/y."<init>":()V
      75: astore_2
      76: aload_1
      77: ifnull        86
      80: aload_2
      81: aload_1
      82: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      85: pop
      86: aload_2
      87: aload_3
      88: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
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
       5: checkcast     #21                 // class android/support/transition/u
       8: aload_2
       9: invokevirtual #117                // Method android/support/transition/u.b:(Landroid/view/View;)Landroid/support/transition/u;
      12: pop
      13: return

  public void b(java.lang.Object, android.view.View, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/support/transition/u
       4: new           #8                  // class android/support/transition/FragmentTransitionSupport$2
       7: dup
       8: aload_0
       9: aload_2
      10: aload_3
      11: invokespecial #137                // Method android/support/transition/FragmentTransitionSupport$2."<init>":(Landroid/support/transition/FragmentTransitionSupport;Landroid/view/View;Ljava/util/ArrayList;)V
      14: invokevirtual #104                // Method android/support/transition/u.a:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      17: pop
      18: return

  public void b(java.lang.Object, java.util.ArrayList<android.view.View>, java.util.ArrayList<android.view.View>);
    Code:
       0: aload_1
       1: checkcast     #21                 // class android/support/transition/u
       4: astore_1
       5: aload_1
       6: instanceof    #37                 // class android/support/transition/y
       9: istore        6
      11: iconst_0
      12: istore        5
      14: iconst_0
      15: istore        4
      17: iload         6
      19: ifeq          61
      22: aload_1
      23: checkcast     #37                 // class android/support/transition/y
      26: astore_1
      27: aload_1
      28: invokevirtual #108                // Method android/support/transition/y.o:()I
      31: istore        5
      33: iload         4
      35: iload         5
      37: if_icmpge     181
      40: aload_0
      41: aload_1
      42: iload         4
      44: invokevirtual #111                // Method android/support/transition/y.b:(I)Landroid/support/transition/u;
      47: aload_2
      48: aload_3
      49: invokevirtual #125                // Method b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      52: iload         4
      54: iconst_1
      55: iadd
      56: istore        4
      58: goto          33
      61: aload_1
      62: invokestatic  #113                // Method a:(Landroid/support/transition/u;)Z
      65: ifne          181
      68: aload_1
      69: invokevirtual #114                // Method android/support/transition/u.g:()Ljava/util/List;
      72: astore        7
      74: aload         7
      76: invokeinterface #138,  1          // InterfaceMethod java/util/List.size:()I
      81: aload_2
      82: invokevirtual #78                 // Method java/util/ArrayList.size:()I
      85: if_icmpne     181
      88: aload         7
      90: aload_2
      91: invokeinterface #141,  2          // InterfaceMethod java/util/List.containsAll:(Ljava/util/Collection;)Z
      96: ifeq          181
      99: aload_3
     100: ifnonnull     109
     103: iconst_0
     104: istore        4
     106: goto          115
     109: aload_3
     110: invokevirtual #78                 // Method java/util/ArrayList.size:()I
     113: istore        4
     115: iload         5
     117: iload         4
     119: if_icmpge     145
     122: aload_1
     123: aload_3
     124: iload         5
     126: invokevirtual #82                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     129: checkcast     #84                 // class android/view/View
     132: invokevirtual #117                // Method android/support/transition/u.b:(Landroid/view/View;)Landroid/support/transition/u;
     135: pop
     136: iload         5
     138: iconst_1
     139: iadd
     140: istore        5
     142: goto          115
     145: aload_2
     146: invokevirtual #78                 // Method java/util/ArrayList.size:()I
     149: iconst_1
     150: isub
     151: istore        4
     153: iload         4
     155: iflt          181
     158: aload_1
     159: aload_2
     160: iload         4
     162: invokevirtual #82                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     165: checkcast     #84                 // class android/view/View
     168: invokevirtual #144                // Method android/support/transition/u.c:(Landroid/view/View;)Landroid/support/transition/u;
     171: pop
     172: iload         4
     174: iconst_1
     175: isub
     176: istore        4
     178: goto          153
     181: return

  public java.lang.Object c(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: new           #37                 // class android/support/transition/y
       9: dup
      10: invokespecial #38                 // Method android/support/transition/y."<init>":()V
      13: astore_2
      14: aload_2
      15: aload_1
      16: checkcast     #21                 // class android/support/transition/u
      19: invokevirtual #42                 // Method android/support/transition/y.b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      22: pop
      23: aload_2
      24: areturn

  public void c(java.lang.Object, android.view.View);
    Code:
       0: aload_1
       1: ifnull        13
       4: aload_1
       5: checkcast     #21                 // class android/support/transition/u
       8: aload_2
       9: invokevirtual #144                // Method android/support/transition/u.c:(Landroid/view/View;)Landroid/support/transition/u;
      12: pop
      13: return
}

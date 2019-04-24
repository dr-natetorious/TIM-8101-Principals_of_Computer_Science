final class android.support.v7.widget.at implements java.lang.Runnable {
  static final java.lang.ThreadLocal<android.support.v7.widget.at> a;

  static java.util.Comparator<android.support.v7.widget.at$b> e;

  java.util.ArrayList<android.support.v7.widget.RecyclerView> b;

  long c;

  long d;

  static {};
    Code:
       0: new           #30                 // class java/lang/ThreadLocal
       3: dup
       4: invokespecial #33                 // Method java/lang/ThreadLocal."<init>":()V
       7: putstatic     #35                 // Field a:Ljava/lang/ThreadLocal;
      10: new           #8                  // class android/support/v7/widget/at$1
      13: dup
      14: invokespecial #36                 // Method android/support/v7/widget/at$1."<init>":()V
      17: putstatic     #38                 // Field e:Ljava/util/Comparator;
      20: return

  android.support.v7.widget.at();
    Code:
       0: aload_0
       1: invokespecial #40                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #42                 // class java/util/ArrayList
       8: dup
       9: invokespecial #43                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #45                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: new           #42                 // class java/util/ArrayList
      19: dup
      20: invokespecial #43                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #47                 // Field f:Ljava/util/ArrayList;
      26: return

  static boolean a(android.support.v7.widget.RecyclerView, int);
    Code:
       0: aload_0
       1: getfield      #152                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
       4: invokevirtual #156                // Method android/support/v7/widget/aj.c:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload_3
      12: if_icmpge     54
      15: aload_0
      16: getfield      #152                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
      19: iload_2
      20: invokevirtual #197                // Method android/support/v7/widget/aj.d:(I)Landroid/view/View;
      23: invokestatic  #200                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      26: astore        4
      28: aload         4
      30: getfield      #201                // Field android/support/v7/widget/RecyclerView$x.c:I
      33: iload_1
      34: if_icmpne     47
      37: aload         4
      39: invokevirtual #73                 // Method android/support/v7/widget/RecyclerView$x.n:()Z
      42: ifne          47
      45: iconst_1
      46: ireturn
      47: iload_2
      48: iconst_1
      49: iadd
      50: istore_2
      51: goto          10
      54: iconst_0
      55: ireturn

  void a(long);
    Code:
       0: aload_0
       1: invokespecial #206                // Method a:()V
       4: aload_0
       5: lload_1
       6: invokespecial #208                // Method b:(J)V
       9: return

  public void a(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #125                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: return

  void a(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: aload_1
       1: invokevirtual #213                // Method android/support/v7/widget/RecyclerView.isAttachedToWindow:()Z
       4: ifeq          30
       7: aload_0
       8: getfield      #215                // Field c:J
      11: lconst_0
      12: lcmp
      13: ifne          30
      16: aload_0
      17: aload_1
      18: invokevirtual #219                // Method android/support/v7/widget/RecyclerView.getNanoTime:()J
      21: putfield      #215                // Field c:J
      24: aload_1
      25: aload_0
      26: invokevirtual #223                // Method android/support/v7/widget/RecyclerView.post:(Ljava/lang/Runnable;)Z
      29: pop
      30: aload_1
      31: getfield      #100                // Field android/support/v7/widget/RecyclerView.B:Landroid/support/v7/widget/at$a;
      34: iload_2
      35: iload_3
      36: invokevirtual #226                // Method android/support/v7/widget/at$a.a:(II)V
      39: return

  public void b(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #229                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
       8: pop
       9: return

  public void run();
    Code:
       0: ldc           #232                // String RV Prefetch
       2: invokestatic  #165                // Method android/support/v4/e/d.a:(Ljava/lang/String;)V
       5: aload_0
       6: getfield      #45                 // Field b:Ljava/util/ArrayList;
       9: invokevirtual #235                // Method java/util/ArrayList.isEmpty:()Z
      12: istore_3
      13: iload_3
      14: ifeq          26
      17: aload_0
      18: lconst_0
      19: putfield      #215                // Field c:J
      22: invokestatic  #181                // Method android/support/v4/e/d.a:()V
      25: return
      26: aload_0
      27: getfield      #45                 // Field b:Ljava/util/ArrayList;
      30: invokevirtual #89                 // Method java/util/ArrayList.size:()I
      33: istore_2
      34: iconst_0
      35: istore_1
      36: lconst_0
      37: lstore        4
      39: iload_1
      40: iload_2
      41: if_icmpge     134
      44: aload_0
      45: getfield      #45                 // Field b:Ljava/util/ArrayList;
      48: iload_1
      49: invokevirtual #93                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      52: checkcast     #53                 // class android/support/v7/widget/RecyclerView
      55: astore        8
      57: lload         4
      59: lstore        6
      61: aload         8
      63: invokevirtual #96                 // Method android/support/v7/widget/RecyclerView.getWindowVisibility:()I
      66: ifne          123
      69: aload         8
      71: invokevirtual #238                // Method android/support/v7/widget/RecyclerView.getDrawingTime:()J
      74: lload         4
      76: invokestatic  #242                // Method java/lang/Math.max:(JJ)J
      79: lstore        6
      81: goto          123
      84: aload_0
      85: getstatic     #248                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
      88: lload         4
      90: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toNanos:(J)J
      93: aload_0
      94: getfield      #254                // Field d:J
      97: ladd
      98: invokevirtual #256                // Method a:(J)V
     101: aload_0
     102: lconst_0
     103: putfield      #215                // Field c:J
     106: invokestatic  #181                // Method android/support/v4/e/d.a:()V
     109: return
     110: astore        8
     112: aload_0
     113: lconst_0
     114: putfield      #215                // Field c:J
     117: invokestatic  #181                // Method android/support/v4/e/d.a:()V
     120: aload         8
     122: athrow
     123: iload_1
     124: iconst_1
     125: iadd
     126: istore_1
     127: lload         6
     129: lstore        4
     131: goto          39
     134: lload         4
     136: lconst_0
     137: lcmp
     138: ifne          84
     141: goto          17
    Exception table:
       from    to  target type
           0    13   110   any
          26    34   110   any
          44    57   110   any
          61    81   110   any
          84   101   110   any
}

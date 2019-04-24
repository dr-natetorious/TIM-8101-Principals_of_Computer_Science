public abstract class android.support.v7.widget.bi extends android.support.v7.widget.RecyclerView$f {
  boolean h;

  public android.support.v7.widget.bi();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method android/support/v7/widget/RecyclerView$f."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #12                 // Field h:Z
       9: return

  public final void a(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #18                 // Method d:(Landroid/support/v7/widget/RecyclerView$x;Z)V
       6: aload_0
       7: aload_1
       8: invokevirtual #22                 // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
      11: return

  public abstract boolean a(android.support.v7.widget.RecyclerView$x);

  public abstract boolean a(android.support.v7.widget.RecyclerView$x, int, int, int, int);

  public boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_2
       1: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
       4: istore        6
       6: aload_2
       7: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      10: istore        7
      12: aload_1
      13: getfield      #38                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      16: astore_2
      17: aload_3
      18: ifnonnull     30
      21: aload_2
      22: invokevirtual #44                 // Method android/view/View.getLeft:()I
      25: istore        4
      27: goto          39
      30: aload_3
      31: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      34: istore        4
      36: goto          27
      39: aload_3
      40: ifnonnull     52
      43: aload_2
      44: invokevirtual #47                 // Method android/view/View.getTop:()I
      47: istore        5
      49: goto          61
      52: aload_3
      53: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      56: istore        5
      58: goto          49
      61: aload_1
      62: invokevirtual #51                 // Method android/support/v7/widget/RecyclerView$x.q:()Z
      65: ifne          118
      68: iload         6
      70: iload         4
      72: if_icmpne     82
      75: iload         7
      77: iload         5
      79: if_icmpeq     118
      82: aload_2
      83: iload         4
      85: iload         5
      87: aload_2
      88: invokevirtual #54                 // Method android/view/View.getWidth:()I
      91: iload         4
      93: iadd
      94: aload_2
      95: invokevirtual #57                 // Method android/view/View.getHeight:()I
      98: iload         5
     100: iadd
     101: invokevirtual #61                 // Method android/view/View.layout:(IIII)V
     104: aload_0
     105: aload_1
     106: iload         6
     108: iload         7
     110: iload         4
     112: iload         5
     114: invokevirtual #63                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;IIII)Z
     117: ireturn
     118: aload_0
     119: aload_1
     120: invokevirtual #65                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;)Z
     123: ireturn

  public abstract boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$x, int, int, int, int);

  public boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_3
       1: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
       4: istore        7
       6: aload_3
       7: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      10: istore        8
      12: aload_2
      13: invokevirtual #70                 // Method android/support/v7/widget/RecyclerView$x.c:()Z
      16: ifeq          34
      19: aload_3
      20: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      23: istore        5
      25: aload_3
      26: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      29: istore        6
      31: goto          48
      34: aload         4
      36: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      39: istore        5
      41: aload         4
      43: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      46: istore        6
      48: aload_0
      49: aload_1
      50: aload_2
      51: iload         7
      53: iload         8
      55: iload         5
      57: iload         6
      59: invokevirtual #72                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$x;IIII)Z
      62: ireturn

  public final void b(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #74                 // Method c:(Landroid/support/v7/widget/RecyclerView$x;Z)V
       6: return

  public abstract boolean b(android.support.v7.widget.RecyclerView$x);

  public boolean b(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_2
       1: ifnull        48
       4: aload_2
       5: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
       8: aload_3
       9: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      12: if_icmpne     26
      15: aload_2
      16: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      19: aload_3
      20: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      23: if_icmpeq     48
      26: aload_0
      27: aload_1
      28: aload_2
      29: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      32: aload_2
      33: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      36: aload_3
      37: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      40: aload_3
      41: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      44: invokevirtual #63                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;IIII)Z
      47: ireturn
      48: aload_0
      49: aload_1
      50: invokevirtual #76                 // Method b:(Landroid/support/v7/widget/RecyclerView$x;)Z
      53: ireturn

  public void c(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: return

  public boolean c(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_2
       1: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
       4: aload_3
       5: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
       8: if_icmpne     32
      11: aload_2
      12: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      15: aload_3
      16: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      19: if_icmpeq     25
      22: goto          32
      25: aload_0
      26: aload_1
      27: invokevirtual #79                 // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
      30: iconst_0
      31: ireturn
      32: aload_0
      33: aload_1
      34: aload_2
      35: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      38: aload_2
      39: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      42: aload_3
      43: getfield      #30                 // Field android/support/v7/widget/RecyclerView$f$c.a:I
      46: aload_3
      47: getfield      #33                 // Field android/support/v7/widget/RecyclerView$f$c.b:I
      50: invokevirtual #63                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;IIII)Z
      53: ireturn

  public void d(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: return

  public boolean h(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #12                 // Field h:Z
       4: ifeq          19
       7: aload_1
       8: invokevirtual #82                 // Method android/support/v7/widget/RecyclerView$x.n:()Z
      11: ifeq          17
      14: goto          19
      17: iconst_0
      18: ireturn
      19: iconst_1
      20: ireturn

  public final void i(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #86                 // Method p:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #22                 // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
      10: return

  public final void j(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #89                 // Method t:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #22                 // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
      10: return

  public final void k(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #93                 // Method r:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #22                 // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
      10: return

  public final void l(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #97                 // Method o:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: return

  public final void m(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #101                // Method s:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: return

  public final void n(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #103                // Method q:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: return

  public void o(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public void p(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public void q(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public void r(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public void s(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public void t(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return
}

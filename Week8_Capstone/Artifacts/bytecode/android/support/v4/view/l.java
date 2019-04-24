public class android.support.v4.view.l {
  public android.support.v4.view.l(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #20                 // Field c:Landroid/view/View;
       9: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #30                 // Field d:Z
       4: ifeq          14
       7: aload_0
       8: getfield      #20                 // Field c:Landroid/view/View;
      11: invokestatic  #35                 // Method android/support/v4/view/s.v:(Landroid/view/View;)V
      14: aload_0
      15: iload_1
      16: putfield      #30                 // Field d:Z
      19: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #30                 // Field d:Z
       4: ireturn

  public boolean a(float, float);
    Code:
       0: aload_0
       1: invokevirtual #39                 // Method a:()Z
       4: ifeq          28
       7: aload_0
       8: iconst_0
       9: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
      12: astore_3
      13: aload_3
      14: ifnull        28
      17: aload_3
      18: aload_0
      19: getfield      #20                 // Field c:Landroid/view/View;
      22: fload_1
      23: fload_2
      24: invokestatic  #46                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;FF)Z
      27: ireturn
      28: iconst_0
      29: ireturn

  public boolean a(float, float, boolean);
    Code:
       0: aload_0
       1: invokevirtual #39                 // Method a:()Z
       4: ifeq          32
       7: aload_0
       8: iconst_0
       9: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
      12: astore        4
      14: aload         4
      16: ifnull        32
      19: aload         4
      21: aload_0
      22: getfield      #20                 // Field c:Landroid/view/View;
      25: fload_1
      26: fload_2
      27: iload_3
      28: invokestatic  #50                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z
      31: ireturn
      32: iconst_0
      33: ireturn

  public boolean a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
       5: ifnull        10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public boolean a(int, int);
    Code:
       0: aload_0
       1: iload_2
       2: invokevirtual #54                 // Method a:(I)Z
       5: ifeq          10
       8: iconst_1
       9: ireturn
      10: aload_0
      11: invokevirtual #39                 // Method a:()Z
      14: ifeq          93
      17: aload_0
      18: getfield      #20                 // Field c:Landroid/view/View;
      21: invokevirtual #60                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      24: astore_3
      25: aload_0
      26: getfield      #20                 // Field c:Landroid/view/View;
      29: astore        4
      31: aload_3
      32: ifnull        93
      35: aload_3
      36: aload         4
      38: aload_0
      39: getfield      #20                 // Field c:Landroid/view/View;
      42: iload_1
      43: iload_2
      44: invokestatic  #63                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;II)Z
      47: ifeq          70
      50: aload_0
      51: iload_2
      52: aload_3
      53: invokespecial #65                 // Method a:(ILandroid/view/ViewParent;)V
      56: aload_3
      57: aload         4
      59: aload_0
      60: getfield      #20                 // Field c:Landroid/view/View;
      63: iload_1
      64: iload_2
      65: invokestatic  #68                 // Method android/support/v4/view/w.b:(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;II)V
      68: iconst_1
      69: ireturn
      70: aload_3
      71: instanceof    #56                 // class android/view/View
      74: ifeq          83
      77: aload_3
      78: checkcast     #56                 // class android/view/View
      81: astore        4
      83: aload_3
      84: invokeinterface #71,  1           // InterfaceMethod android/view/ViewParent.getParent:()Landroid/view/ViewParent;
      89: astore_3
      90: goto          31
      93: iconst_0
      94: ireturn

  public boolean a(int, int, int, int, int[]);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: aload         5
       8: iconst_0
       9: invokevirtual #75                 // Method a:(IIII[II)Z
      12: ireturn

  public boolean a(int, int, int, int, int[], int);
    Code:
       0: aload_0
       1: invokevirtual #39                 // Method a:()Z
       4: ifeq          148
       7: aload_0
       8: iload         6
      10: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
      13: astore        9
      15: aload         9
      17: ifnonnull     22
      20: iconst_0
      21: ireturn
      22: iload_1
      23: ifne          59
      26: iload_2
      27: ifne          59
      30: iload_3
      31: ifne          59
      34: iload         4
      36: ifeq          42
      39: goto          59
      42: aload         5
      44: ifnull        148
      47: aload         5
      49: iconst_0
      50: iconst_0
      51: iastore
      52: aload         5
      54: iconst_1
      55: iconst_0
      56: iastore
      57: iconst_0
      58: ireturn
      59: aload         5
      61: ifnull        88
      64: aload_0
      65: getfield      #20                 // Field c:Landroid/view/View;
      68: aload         5
      70: invokevirtual #79                 // Method android/view/View.getLocationInWindow:([I)V
      73: aload         5
      75: iconst_0
      76: iaload
      77: istore        7
      79: aload         5
      81: iconst_1
      82: iaload
      83: istore        8
      85: goto          94
      88: iconst_0
      89: istore        7
      91: iconst_0
      92: istore        8
      94: aload         9
      96: aload_0
      97: getfield      #20                 // Field c:Landroid/view/View;
     100: iload_1
     101: iload_2
     102: iload_3
     103: iload         4
     105: iload         6
     107: invokestatic  #82                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;IIIII)V
     110: aload         5
     112: ifnull        146
     115: aload_0
     116: getfield      #20                 // Field c:Landroid/view/View;
     119: aload         5
     121: invokevirtual #79                 // Method android/view/View.getLocationInWindow:([I)V
     124: aload         5
     126: iconst_0
     127: aload         5
     129: iconst_0
     130: iaload
     131: iload         7
     133: isub
     134: iastore
     135: aload         5
     137: iconst_1
     138: aload         5
     140: iconst_1
     141: iaload
     142: iload         8
     144: isub
     145: iastore
     146: iconst_1
     147: ireturn
     148: iconst_0
     149: ireturn

  public boolean a(int, int, int[], int[]);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: aload_3
       4: aload         4
       6: iconst_0
       7: invokevirtual #86                 // Method a:(II[I[II)Z
      10: ireturn

  public boolean a(int, int, int[], int[], int);
    Code:
       0: aload_0
       1: invokevirtual #39                 // Method a:()Z
       4: ifeq          198
       7: aload_0
       8: iload         5
      10: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
      13: astore        10
      15: aload         10
      17: ifnonnull     22
      20: iconst_0
      21: ireturn
      22: iconst_1
      23: istore        8
      25: iload_1
      26: ifne          53
      29: iload_2
      30: ifeq          36
      33: goto          53
      36: aload         4
      38: ifnull        198
      41: aload         4
      43: iconst_0
      44: iconst_0
      45: iastore
      46: aload         4
      48: iconst_1
      49: iconst_0
      50: iastore
      51: iconst_0
      52: ireturn
      53: aload         4
      55: ifnull        82
      58: aload_0
      59: getfield      #20                 // Field c:Landroid/view/View;
      62: aload         4
      64: invokevirtual #79                 // Method android/view/View.getLocationInWindow:([I)V
      67: aload         4
      69: iconst_0
      70: iaload
      71: istore        6
      73: aload         4
      75: iconst_1
      76: iaload
      77: istore        7
      79: goto          88
      82: iconst_0
      83: istore        6
      85: iconst_0
      86: istore        7
      88: aload_3
      89: astore        9
      91: aload_3
      92: ifnonnull     115
      95: aload_0
      96: getfield      #88                 // Field e:[I
      99: ifnonnull     109
     102: aload_0
     103: iconst_2
     104: newarray       int
     106: putfield      #88                 // Field e:[I
     109: aload_0
     110: getfield      #88                 // Field e:[I
     113: astore        9
     115: aload         9
     117: iconst_0
     118: iconst_0
     119: iastore
     120: aload         9
     122: iconst_1
     123: iconst_0
     124: iastore
     125: aload         10
     127: aload_0
     128: getfield      #20                 // Field c:Landroid/view/View;
     131: iload_1
     132: iload_2
     133: aload         9
     135: iload         5
     137: invokestatic  #91                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;II[II)V
     140: aload         4
     142: ifnull        176
     145: aload_0
     146: getfield      #20                 // Field c:Landroid/view/View;
     149: aload         4
     151: invokevirtual #79                 // Method android/view/View.getLocationInWindow:([I)V
     154: aload         4
     156: iconst_0
     157: aload         4
     159: iconst_0
     160: iaload
     161: iload         6
     163: isub
     164: iastore
     165: aload         4
     167: iconst_1
     168: aload         4
     170: iconst_1
     171: iaload
     172: iload         7
     174: isub
     175: iastore
     176: aload         9
     178: iconst_0
     179: iaload
     180: ifne          195
     183: aload         9
     185: iconst_1
     186: iaload
     187: ifeq          192
     190: iconst_1
     191: ireturn
     192: iconst_0
     193: istore        8
     195: iload         8
     197: ireturn
     198: iconst_0
     199: ireturn

  public boolean b();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #54                 // Method a:(I)Z
       5: ireturn

  public boolean b(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #93                 // Method a:(II)Z
       6: ireturn

  public void c();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #96                 // Method c:(I)V
       5: return

  public void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #41                 // Method d:(I)Landroid/view/ViewParent;
       5: astore_2
       6: aload_2
       7: ifnull        25
      10: aload_2
      11: aload_0
      12: getfield      #20                 // Field c:Landroid/view/View;
      15: iload_1
      16: invokestatic  #99                 // Method android/support/v4/view/w.a:(Landroid/view/ViewParent;Landroid/view/View;I)V
      19: aload_0
      20: iload_1
      21: aconst_null
      22: invokespecial #65                 // Method a:(ILandroid/view/ViewParent;)V
      25: return
}

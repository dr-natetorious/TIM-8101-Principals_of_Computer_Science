public abstract class android.support.v7.widget.GridLayoutManager$c {
  final android.util.SparseIntArray a;

  public android.support.v7.widget.GridLayoutManager$c();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #17                 // class android/util/SparseIntArray
       8: dup
       9: invokespecial #18                 // Method android/util/SparseIntArray."<init>":()V
      12: putfield      #20                 // Field a:Landroid/util/SparseIntArray;
      15: aload_0
      16: iconst_0
      17: putfield      #22                 // Field b:Z
      20: return

  public abstract int a(int);

  public int a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #27                 // Method a:(I)I
       5: istore        8
       7: iload         8
       9: iload_2
      10: if_icmpne     15
      13: iconst_0
      14: ireturn
      15: aload_0
      16: getfield      #22                 // Field b:Z
      19: ifeq          64
      22: aload_0
      23: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      26: invokevirtual #31                 // Method android/util/SparseIntArray.size:()I
      29: ifle          64
      32: aload_0
      33: iload_1
      34: invokevirtual #33                 // Method b:(I)I
      37: istore        5
      39: iload         5
      41: iflt          64
      44: aload_0
      45: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      48: iload         5
      50: invokevirtual #36                 // Method android/util/SparseIntArray.get:(I)I
      53: aload_0
      54: iload         5
      56: invokevirtual #27                 // Method a:(I)I
      59: iadd
      60: istore_3
      61: goto          124
      64: iconst_0
      65: istore        4
      67: iconst_0
      68: istore_3
      69: iload         4
      71: iload_1
      72: if_icmpge     133
      75: aload_0
      76: iload         4
      78: invokevirtual #27                 // Method a:(I)I
      81: istore        6
      83: iload_3
      84: iload         6
      86: iadd
      87: istore        7
      89: iload         7
      91: iload_2
      92: if_icmpne     104
      95: iconst_0
      96: istore_3
      97: iload         4
      99: istore        5
     101: goto          124
     104: iload         4
     106: istore        5
     108: iload         7
     110: istore_3
     111: iload         7
     113: iload_2
     114: if_icmple     124
     117: iload         6
     119: istore_3
     120: iload         4
     122: istore        5
     124: iload         5
     126: iconst_1
     127: iadd
     128: istore        4
     130: goto          69
     133: iload         8
     135: iload_3
     136: iadd
     137: iload_2
     138: if_icmpgt     143
     141: iload_3
     142: ireturn
     143: iconst_0
     144: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
       4: invokevirtual #39                 // Method android/util/SparseIntArray.clear:()V
       7: return

  int b(int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
       4: invokevirtual #31                 // Method android/util/SparseIntArray.size:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_2
      13: iload_3
      14: if_icmpgt     53
      17: iload_2
      18: iload_3
      19: iadd
      20: iconst_1
      21: iushr
      22: istore        4
      24: aload_0
      25: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      28: iload         4
      30: invokevirtual #42                 // Method android/util/SparseIntArray.keyAt:(I)I
      33: iload_1
      34: if_icmpge     45
      37: iload         4
      39: iconst_1
      40: iadd
      41: istore_2
      42: goto          12
      45: iload         4
      47: iconst_1
      48: isub
      49: istore_3
      50: goto          12
      53: iload_2
      54: iconst_1
      55: isub
      56: istore_1
      57: iload_1
      58: iflt          81
      61: iload_1
      62: aload_0
      63: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      66: invokevirtual #31                 // Method android/util/SparseIntArray.size:()I
      69: if_icmpge     81
      72: aload_0
      73: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      76: iload_1
      77: invokevirtual #42                 // Method android/util/SparseIntArray.keyAt:(I)I
      80: ireturn
      81: iconst_m1
      82: ireturn

  int b(int, int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field b:Z
       4: ifne          14
       7: aload_0
       8: iload_1
       9: iload_2
      10: invokevirtual #44                 // Method a:(II)I
      13: ireturn
      14: aload_0
      15: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      18: iload_1
      19: iconst_m1
      20: invokevirtual #46                 // Method android/util/SparseIntArray.get:(II)I
      23: istore_3
      24: iload_3
      25: iconst_m1
      26: if_icmpeq     31
      29: iload_3
      30: ireturn
      31: aload_0
      32: iload_1
      33: iload_2
      34: invokevirtual #44                 // Method a:(II)I
      37: istore_2
      38: aload_0
      39: getfield      #20                 // Field a:Landroid/util/SparseIntArray;
      42: iload_1
      43: iload_2
      44: invokevirtual #50                 // Method android/util/SparseIntArray.put:(II)V
      47: iload_2
      48: ireturn

  public int c(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #27                 // Method a:(I)I
       5: istore        9
       7: iconst_0
       8: istore        6
      10: iconst_0
      11: istore_3
      12: iconst_0
      13: istore        4
      15: iload         6
      17: iload_1
      18: if_icmpge     87
      21: aload_0
      22: iload         6
      24: invokevirtual #27                 // Method a:(I)I
      27: istore        7
      29: iload_3
      30: iload         7
      32: iadd
      33: istore        8
      35: iload         8
      37: iload_2
      38: if_icmpne     52
      41: iload         4
      43: iconst_1
      44: iadd
      45: istore        5
      47: iconst_0
      48: istore_3
      49: goto          74
      52: iload         8
      54: istore_3
      55: iload         4
      57: istore        5
      59: iload         8
      61: iload_2
      62: if_icmple     74
      65: iload         4
      67: iconst_1
      68: iadd
      69: istore        5
      71: iload         7
      73: istore_3
      74: iload         6
      76: iconst_1
      77: iadd
      78: istore        6
      80: iload         5
      82: istore        4
      84: goto          15
      87: iload         4
      89: istore_1
      90: iload_3
      91: iload         9
      93: iadd
      94: iload_2
      95: if_icmple     103
      98: iload         4
     100: iconst_1
     101: iadd
     102: istore_1
     103: iload_1
     104: ireturn
}

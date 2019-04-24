public class android.databinding.b<C, T, A> implements java.lang.Cloneable {
  public android.databinding.b<C, T, A> a();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: invokespecial #76                 // Method java/lang/Object.clone:()Ljava/lang/Object;
       6: checkcast     #2                  // class android/databinding/b
       9: astore_3
      10: aload_3
      11: lconst_0
      12: putfield      #68                 // Field b:J
      15: aload_3
      16: aconst_null
      17: putfield      #39                 // Field c:[J
      20: iconst_0
      21: istore_1
      22: aload_3
      23: iconst_0
      24: putfield      #78                 // Field d:I
      27: aload_3
      28: new           #80                 // class java/util/ArrayList
      31: dup
      32: invokespecial #84                 // Method java/util/ArrayList."<init>":()V
      35: putfield      #26                 // Field a:Ljava/util/List;
      38: aload_0
      39: getfield      #26                 // Field a:Ljava/util/List;
      42: invokeinterface #43,  1           // InterfaceMethod java/util/List.size:()I
      47: istore_2
      48: aload_3
      49: astore        4
      51: iload_1
      52: iload_2
      53: if_icmpge     112
      56: aload_0
      57: iload_1
      58: invokespecial #86                 // Method a:(I)Z
      61: ifne          84
      64: aload_3
      65: getfield      #26                 // Field a:Ljava/util/List;
      68: aload_0
      69: getfield      #26                 // Field a:Ljava/util/List;
      72: iload_1
      73: invokeinterface #61,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      78: invokeinterface #90,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      83: pop
      84: iload_1
      85: iconst_1
      86: iadd
      87: istore_1
      88: goto          48
      91: astore        4
      93: goto          104
      96: astore_3
      97: goto          117
     100: astore        4
     102: aconst_null
     103: astore_3
     104: aload         4
     106: invokestatic  #95                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     109: aload_3
     110: astore        4
     112: aload_0
     113: monitorexit
     114: aload         4
     116: areturn
     117: aload_0
     118: monitorexit
     119: aload_3
     120: athrow
    Exception table:
       from    to  target type
           2    10   100   Class java/lang/CloneNotSupportedException
           2    10    96   any
          10    20    91   Class java/lang/CloneNotSupportedException
          10    20    96   any
          22    48    91   Class java/lang/CloneNotSupportedException
          22    48    96   any
          56    84    91   Class java/lang/CloneNotSupportedException
          56    84    96   any
         104   109    96   any

  public void a(T, int, A);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: aload_0
       4: getfield      #78                 // Field d:I
       7: iconst_1
       8: iadd
       9: putfield      #78                 // Field d:I
      12: aload_0
      13: aload_1
      14: iload_2
      15: aload_3
      16: invokespecial #98                 // Method c:(Ljava/lang/Object;ILjava/lang/Object;)V
      19: aload_0
      20: aload_0
      21: getfield      #78                 // Field d:I
      24: iconst_1
      25: isub
      26: putfield      #78                 // Field d:I
      29: aload_0
      30: getfield      #78                 // Field d:I
      33: ifne          115
      36: aload_0
      37: getfield      #39                 // Field c:[J
      40: ifnull        92
      43: aload_0
      44: getfield      #39                 // Field c:[J
      47: arraylength
      48: iconst_1
      49: isub
      50: istore_2
      51: iload_2
      52: iflt          92
      55: aload_0
      56: getfield      #39                 // Field c:[J
      59: iload_2
      60: laload
      61: lstore        4
      63: lload         4
      65: lconst_0
      66: lcmp
      67: ifeq          123
      70: aload_0
      71: iload_2
      72: iconst_1
      73: iadd
      74: bipush        64
      76: imul
      77: lload         4
      79: invokespecial #100                // Method a:(IJ)V
      82: aload_0
      83: getfield      #39                 // Field c:[J
      86: iload_2
      87: lconst_0
      88: lastore
      89: goto          123
      92: aload_0
      93: getfield      #68                 // Field b:J
      96: lconst_0
      97: lcmp
      98: ifeq          115
     101: aload_0
     102: iconst_0
     103: aload_0
     104: getfield      #68                 // Field b:J
     107: invokespecial #100                // Method a:(IJ)V
     110: aload_0
     111: lconst_0
     112: putfield      #68                 // Field b:J
     115: aload_0
     116: monitorexit
     117: return
     118: astore_1
     119: aload_0
     120: monitorexit
     121: aload_1
     122: athrow
     123: iload_2
     124: iconst_1
     125: isub
     126: istore_2
     127: goto          51
    Exception table:
       from    to  target type
           2    51   118   any
          55    63   118   any
          70    89   118   any
          92   115   118   any

  public java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #102                // Method a:()Landroid/databinding/b;
       4: areturn
}

class android.support.v7.widget.aj$a {
  long a;

  android.support.v7.widget.aj$a b;

  android.support.v7.widget.aj$a();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: lconst_0
       6: putfield      #16                 // Field a:J
       9: return

  void a();
    Code:
       0: aload_0
       1: lconst_0
       2: putfield      #16                 // Field a:J
       5: aload_0
       6: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
       9: ifnull        19
      12: aload_0
      13: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      16: invokevirtual #22                 // Method a:()V
      19: return

  void a(int);
    Code:
       0: iload_1
       1: bipush        64
       3: if_icmplt     22
       6: aload_0
       7: invokespecial #25                 // Method b:()V
      10: aload_0
      11: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      14: iload_1
      15: bipush        64
      17: isub
      18: invokevirtual #27                 // Method a:(I)V
      21: return
      22: aload_0
      23: aload_0
      24: getfield      #16                 // Field a:J
      27: lconst_1
      28: iload_1
      29: lshl
      30: lor
      31: putfield      #16                 // Field a:J
      34: return

  void a(int, boolean);
    Code:
       0: iload_1
       1: bipush        64
       3: if_icmplt     23
       6: aload_0
       7: invokespecial #25                 // Method b:()V
      10: aload_0
      11: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      14: iload_1
      15: bipush        64
      17: isub
      18: iload_2
      19: invokevirtual #30                 // Method a:(IZ)V
      22: return
      23: aload_0
      24: getfield      #16                 // Field a:J
      27: ldc2_w        #31                 // long -9223372036854775808l
      30: land
      31: lconst_0
      32: lcmp
      33: ifeq          41
      36: iconst_1
      37: istore_3
      38: goto          43
      41: iconst_0
      42: istore_3
      43: lconst_1
      44: iload_1
      45: lshl
      46: lconst_1
      47: lsub
      48: lstore        4
      50: aload_0
      51: aload_0
      52: getfield      #16                 // Field a:J
      55: lload         4
      57: land
      58: aload_0
      59: getfield      #16                 // Field a:J
      62: lload         4
      64: ldc2_w        #33                 // long -1l
      67: lxor
      68: land
      69: iconst_1
      70: lshl
      71: lor
      72: putfield      #16                 // Field a:J
      75: iload_2
      76: ifeq          87
      79: aload_0
      80: iload_1
      81: invokevirtual #27                 // Method a:(I)V
      84: goto          92
      87: aload_0
      88: iload_1
      89: invokevirtual #36                 // Method b:(I)V
      92: iload_3
      93: ifne          103
      96: aload_0
      97: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
     100: ifnull        116
     103: aload_0
     104: invokespecial #25                 // Method b:()V
     107: aload_0
     108: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
     111: iconst_0
     112: iload_3
     113: invokevirtual #30                 // Method a:(IZ)V
     116: return

  void b(int);
    Code:
       0: iload_1
       1: bipush        64
       3: if_icmplt     25
       6: aload_0
       7: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      10: ifnull        41
      13: aload_0
      14: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      17: iload_1
      18: bipush        64
      20: isub
      21: invokevirtual #36                 // Method b:(I)V
      24: return
      25: aload_0
      26: aload_0
      27: getfield      #16                 // Field a:J
      30: lconst_1
      31: iload_1
      32: lshl
      33: ldc2_w        #33                 // long -1l
      36: lxor
      37: land
      38: putfield      #16                 // Field a:J
      41: return

  boolean c(int);
    Code:
       0: iload_1
       1: bipush        64
       3: if_icmplt     22
       6: aload_0
       7: invokespecial #25                 // Method b:()V
      10: aload_0
      11: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      14: iload_1
      15: bipush        64
      17: isub
      18: invokevirtual #40                 // Method c:(I)Z
      21: ireturn
      22: aload_0
      23: getfield      #16                 // Field a:J
      26: lconst_1
      27: iload_1
      28: lshl
      29: land
      30: lconst_0
      31: lcmp
      32: ifeq          37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn

  boolean d(int);
    Code:
       0: iload_1
       1: bipush        64
       3: if_icmplt     22
       6: aload_0
       7: invokespecial #25                 // Method b:()V
      10: aload_0
      11: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      14: iload_1
      15: bipush        64
      17: isub
      18: invokevirtual #43                 // Method d:(I)Z
      21: ireturn
      22: lconst_1
      23: iload_1
      24: lshl
      25: lstore_2
      26: aload_0
      27: getfield      #16                 // Field a:J
      30: lload_2
      31: land
      32: lconst_0
      33: lcmp
      34: ifeq          43
      37: iconst_1
      38: istore        4
      40: goto          46
      43: iconst_0
      44: istore        4
      46: aload_0
      47: aload_0
      48: getfield      #16                 // Field a:J
      51: lload_2
      52: ldc2_w        #33                 // long -1l
      55: lxor
      56: land
      57: putfield      #16                 // Field a:J
      60: lload_2
      61: lconst_1
      62: lsub
      63: lstore_2
      64: aload_0
      65: aload_0
      66: getfield      #16                 // Field a:J
      69: lload_2
      70: land
      71: aload_0
      72: getfield      #16                 // Field a:J
      75: lload_2
      76: ldc2_w        #33                 // long -1l
      79: lxor
      80: land
      81: iconst_1
      82: invokestatic  #49                 // Method java/lang/Long.rotateRight:(JI)J
      85: lor
      86: putfield      #16                 // Field a:J
      89: aload_0
      90: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      93: ifnull        122
      96: aload_0
      97: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
     100: iconst_0
     101: invokevirtual #40                 // Method c:(I)Z
     104: ifeq          113
     107: aload_0
     108: bipush        63
     110: invokevirtual #27                 // Method a:(I)V
     113: aload_0
     114: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
     117: iconst_0
     118: invokevirtual #43                 // Method d:(I)Z
     121: pop
     122: iload         4
     124: ireturn

  int e(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
       4: ifnonnull     35
       7: iload_1
       8: bipush        64
      10: if_icmplt     21
      13: aload_0
      14: getfield      #16                 // Field a:J
      17: invokestatic  #55                 // Method java/lang/Long.bitCount:(J)I
      20: ireturn
      21: aload_0
      22: getfield      #16                 // Field a:J
      25: lconst_1
      26: iload_1
      27: lshl
      28: lconst_1
      29: lsub
      30: land
      31: invokestatic  #55                 // Method java/lang/Long.bitCount:(J)I
      34: ireturn
      35: iload_1
      36: bipush        64
      38: if_icmpge     55
      41: aload_0
      42: getfield      #16                 // Field a:J
      45: lconst_1
      46: iload_1
      47: lshl
      48: lconst_1
      49: lsub
      50: land
      51: invokestatic  #55                 // Method java/lang/Long.bitCount:(J)I
      54: ireturn
      55: aload_0
      56: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      59: iload_1
      60: bipush        64
      62: isub
      63: invokevirtual #57                 // Method e:(I)I
      66: aload_0
      67: getfield      #16                 // Field a:J
      70: invokestatic  #55                 // Method java/lang/Long.bitCount:(J)I
      73: iadd
      74: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
       4: ifnonnull     15
       7: aload_0
       8: getfield      #16                 // Field a:J
      11: invokestatic  #63                 // Method java/lang/Long.toBinaryString:(J)Ljava/lang/String;
      14: areturn
      15: new           #65                 // class java/lang/StringBuilder
      18: dup
      19: invokespecial #66                 // Method java/lang/StringBuilder."<init>":()V
      22: astore_1
      23: aload_1
      24: aload_0
      25: getfield      #19                 // Field b:Landroid/support/v7/widget/aj$a;
      28: invokevirtual #68                 // Method toString:()Ljava/lang/String;
      31: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload_1
      36: ldc           #74                 // String xx
      38: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      41: pop
      42: aload_1
      43: aload_0
      44: getfield      #16                 // Field a:J
      47: invokestatic  #63                 // Method java/lang/Long.toBinaryString:(J)Ljava/lang/String;
      50: invokevirtual #72                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      53: pop
      54: aload_1
      55: invokevirtual #75                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      58: areturn
}

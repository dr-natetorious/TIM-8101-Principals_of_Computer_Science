public class android.support.v7.g.b implements android.support.v7.g.d {
  final android.support.v7.g.d a;

  int b;

  int c;

  int d;

  java.lang.Object e;

  public android.support.v7.g.b(android.support.v7.g.d);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #21                 // Field b:I
       9: aload_0
      10: iconst_m1
      11: putfield      #23                 // Field c:I
      14: aload_0
      15: iconst_m1
      16: putfield      #25                 // Field d:I
      19: aload_0
      20: aconst_null
      21: putfield      #27                 // Field e:Ljava/lang/Object;
      24: aload_0
      25: aload_1
      26: putfield      #29                 // Field a:Landroid/support/v7/g/d;
      29: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:I
       4: ifne          8
       7: return
       8: aload_0
       9: getfield      #21                 // Field b:I
      12: tableswitch   { // 1 to 3
                     1: 87
                     2: 67
                     3: 43
               default: 40
          }
      40: goto          104
      43: aload_0
      44: getfield      #29                 // Field a:Landroid/support/v7/g/d;
      47: aload_0
      48: getfield      #23                 // Field c:I
      51: aload_0
      52: getfield      #25                 // Field d:I
      55: aload_0
      56: getfield      #27                 // Field e:Ljava/lang/Object;
      59: invokeinterface #33,  4           // InterfaceMethod android/support/v7/g/d.a:(IILjava/lang/Object;)V
      64: goto          104
      67: aload_0
      68: getfield      #29                 // Field a:Landroid/support/v7/g/d;
      71: aload_0
      72: getfield      #23                 // Field c:I
      75: aload_0
      76: getfield      #25                 // Field d:I
      79: invokeinterface #36,  3           // InterfaceMethod android/support/v7/g/d.b:(II)V
      84: goto          104
      87: aload_0
      88: getfield      #29                 // Field a:Landroid/support/v7/g/d;
      91: aload_0
      92: getfield      #23                 // Field c:I
      95: aload_0
      96: getfield      #25                 // Field d:I
      99: invokeinterface #38,  3           // InterfaceMethod android/support/v7/g/d.a:(II)V
     104: aload_0
     105: aconst_null
     106: putfield      #27                 // Field e:Ljava/lang/Object;
     109: aload_0
     110: iconst_0
     111: putfield      #21                 // Field b:I
     114: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:I
       4: iconst_1
       5: if_icmpne     52
       8: iload_1
       9: aload_0
      10: getfield      #23                 // Field c:I
      13: if_icmplt     52
      16: iload_1
      17: aload_0
      18: getfield      #23                 // Field c:I
      21: aload_0
      22: getfield      #25                 // Field d:I
      25: iadd
      26: if_icmpgt     52
      29: aload_0
      30: aload_0
      31: getfield      #25                 // Field d:I
      34: iload_2
      35: iadd
      36: putfield      #25                 // Field d:I
      39: aload_0
      40: iload_1
      41: aload_0
      42: getfield      #23                 // Field c:I
      45: invokestatic  #44                 // Method java/lang/Math.min:(II)I
      48: putfield      #23                 // Field c:I
      51: return
      52: aload_0
      53: invokevirtual #46                 // Method a:()V
      56: aload_0
      57: iload_1
      58: putfield      #23                 // Field c:I
      61: aload_0
      62: iload_2
      63: putfield      #25                 // Field d:I
      66: aload_0
      67: iconst_1
      68: putfield      #21                 // Field b:I
      71: return

  public void a(int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:I
       4: iconst_3
       5: if_icmpne     85
       8: iload_1
       9: aload_0
      10: getfield      #23                 // Field c:I
      13: aload_0
      14: getfield      #25                 // Field d:I
      17: iadd
      18: if_icmpgt     85
      21: iload_1
      22: iload_2
      23: iadd
      24: istore        4
      26: iload         4
      28: aload_0
      29: getfield      #23                 // Field c:I
      32: if_icmplt     85
      35: aload_0
      36: getfield      #27                 // Field e:Ljava/lang/Object;
      39: aload_3
      40: if_acmpne     85
      43: aload_0
      44: getfield      #23                 // Field c:I
      47: istore_2
      48: aload_0
      49: getfield      #25                 // Field d:I
      52: istore        5
      54: aload_0
      55: iload_1
      56: aload_0
      57: getfield      #23                 // Field c:I
      60: invokestatic  #44                 // Method java/lang/Math.min:(II)I
      63: putfield      #23                 // Field c:I
      66: aload_0
      67: iload_2
      68: iload         5
      70: iadd
      71: iload         4
      73: invokestatic  #49                 // Method java/lang/Math.max:(II)I
      76: aload_0
      77: getfield      #23                 // Field c:I
      80: isub
      81: putfield      #25                 // Field d:I
      84: return
      85: aload_0
      86: invokevirtual #46                 // Method a:()V
      89: aload_0
      90: iload_1
      91: putfield      #23                 // Field c:I
      94: aload_0
      95: iload_2
      96: putfield      #25                 // Field d:I
      99: aload_0
     100: aload_3
     101: putfield      #27                 // Field e:Ljava/lang/Object;
     104: aload_0
     105: iconst_3
     106: putfield      #21                 // Field b:I
     109: return

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:I
       4: iconst_2
       5: if_icmpne     42
       8: aload_0
       9: getfield      #23                 // Field c:I
      12: iload_1
      13: if_icmplt     42
      16: aload_0
      17: getfield      #23                 // Field c:I
      20: iload_1
      21: iload_2
      22: iadd
      23: if_icmpgt     42
      26: aload_0
      27: aload_0
      28: getfield      #25                 // Field d:I
      31: iload_2
      32: iadd
      33: putfield      #25                 // Field d:I
      36: aload_0
      37: iload_1
      38: putfield      #23                 // Field c:I
      41: return
      42: aload_0
      43: invokevirtual #46                 // Method a:()V
      46: aload_0
      47: iload_1
      48: putfield      #23                 // Field c:I
      51: aload_0
      52: iload_2
      53: putfield      #25                 // Field d:I
      56: aload_0
      57: iconst_2
      58: putfield      #21                 // Field b:I
      61: return

  public void c(int, int);
    Code:
       0: aload_0
       1: invokevirtual #46                 // Method a:()V
       4: aload_0
       5: getfield      #29                 // Field a:Landroid/support/v7/g/d;
       8: iload_1
       9: iload_2
      10: invokeinterface #51,  3           // InterfaceMethod android/support/v7/g/d.c:(II)V
      15: return
}

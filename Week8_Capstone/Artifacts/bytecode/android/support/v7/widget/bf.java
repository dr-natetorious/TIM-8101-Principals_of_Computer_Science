class android.support.v7.widget.bf {
  android.support.v7.widget.bf();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #20                 // Field a:I
       9: aload_0
      10: iconst_0
      11: putfield      #22                 // Field b:I
      14: aload_0
      15: ldc           #23                 // int -2147483648
      17: putfield      #25                 // Field c:I
      20: aload_0
      21: ldc           #23                 // int -2147483648
      23: putfield      #27                 // Field d:I
      26: aload_0
      27: iconst_0
      28: putfield      #29                 // Field e:I
      31: aload_0
      32: iconst_0
      33: putfield      #31                 // Field f:I
      36: aload_0
      37: iconst_0
      38: putfield      #33                 // Field g:Z
      41: aload_0
      42: iconst_0
      43: putfield      #35                 // Field h:Z
      46: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:I
       4: ireturn

  public void a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #25                 // Field c:I
       5: aload_0
       6: iload_2
       7: putfield      #27                 // Field d:I
      10: aload_0
      11: iconst_1
      12: putfield      #35                 // Field h:Z
      15: aload_0
      16: getfield      #33                 // Field g:Z
      19: ifeq          45
      22: iload_2
      23: ldc           #23                 // int -2147483648
      25: if_icmpeq     33
      28: aload_0
      29: iload_2
      30: putfield      #20                 // Field a:I
      33: iload_1
      34: ldc           #23                 // int -2147483648
      36: if_icmpeq     67
      39: aload_0
      40: iload_1
      41: putfield      #22                 // Field b:I
      44: return
      45: iload_1
      46: ldc           #23                 // int -2147483648
      48: if_icmpeq     56
      51: aload_0
      52: iload_1
      53: putfield      #20                 // Field a:I
      56: iload_2
      57: ldc           #23                 // int -2147483648
      59: if_icmpeq     67
      62: aload_0
      63: iload_2
      64: putfield      #22                 // Field b:I
      67: return

  public void a(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #33                 // Field g:Z
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #33                 // Field g:Z
      14: aload_0
      15: getfield      #35                 // Field h:Z
      18: ifeq          113
      21: iload_1
      22: ifeq          69
      25: aload_0
      26: getfield      #27                 // Field d:I
      29: ldc           #23                 // int -2147483648
      31: if_icmpeq     42
      34: aload_0
      35: getfield      #27                 // Field d:I
      38: istore_2
      39: goto          47
      42: aload_0
      43: getfield      #29                 // Field e:I
      46: istore_2
      47: aload_0
      48: iload_2
      49: putfield      #20                 // Field a:I
      52: aload_0
      53: getfield      #25                 // Field c:I
      56: ldc           #23                 // int -2147483648
      58: if_icmpeq     121
      61: aload_0
      62: getfield      #25                 // Field c:I
      65: istore_2
      66: goto          126
      69: aload_0
      70: getfield      #25                 // Field c:I
      73: ldc           #23                 // int -2147483648
      75: if_icmpeq     86
      78: aload_0
      79: getfield      #25                 // Field c:I
      82: istore_2
      83: goto          91
      86: aload_0
      87: getfield      #29                 // Field e:I
      90: istore_2
      91: aload_0
      92: iload_2
      93: putfield      #20                 // Field a:I
      96: aload_0
      97: getfield      #27                 // Field d:I
     100: ldc           #23                 // int -2147483648
     102: if_icmpeq     121
     105: aload_0
     106: getfield      #27                 // Field d:I
     109: istore_2
     110: goto          126
     113: aload_0
     114: aload_0
     115: getfield      #29                 // Field e:I
     118: putfield      #20                 // Field a:I
     121: aload_0
     122: getfield      #31                 // Field f:I
     125: istore_2
     126: aload_0
     127: iload_2
     128: putfield      #22                 // Field b:I
     131: return

  public int b();
    Code:
       0: aload_0
       1: getfield      #22                 // Field b:I
       4: ireturn

  public void b(int, int);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #35                 // Field h:Z
       5: iload_1
       6: ldc           #23                 // int -2147483648
       8: if_icmpeq     21
      11: aload_0
      12: iload_1
      13: putfield      #29                 // Field e:I
      16: aload_0
      17: iload_1
      18: putfield      #20                 // Field a:I
      21: iload_2
      22: ldc           #23                 // int -2147483648
      24: if_icmpeq     37
      27: aload_0
      28: iload_2
      29: putfield      #31                 // Field f:I
      32: aload_0
      33: iload_2
      34: putfield      #22                 // Field b:I
      37: return

  public int c();
    Code:
       0: aload_0
       1: getfield      #33                 // Field g:Z
       4: ifeq          12
       7: aload_0
       8: getfield      #22                 // Field b:I
      11: ireturn
      12: aload_0
      13: getfield      #20                 // Field a:I
      16: ireturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #33                 // Field g:Z
       4: ifeq          12
       7: aload_0
       8: getfield      #20                 // Field a:I
      11: ireturn
      12: aload_0
      13: getfield      #22                 // Field b:I
      16: ireturn
}

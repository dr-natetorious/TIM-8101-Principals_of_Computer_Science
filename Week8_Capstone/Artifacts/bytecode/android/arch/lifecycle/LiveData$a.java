abstract class android.arch.lifecycle.LiveData$a {
  final android.arch.lifecycle.k<T> c;

  boolean d;

  int e;

  final android.arch.lifecycle.LiveData f;

  android.arch.lifecycle.LiveData$a(android.arch.lifecycle.k<T>);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
       5: aload_0
       6: invokespecial #23                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iconst_m1
      11: putfield      #25                 // Field e:I
      14: aload_0
      15: aload_2
      16: putfield      #27                 // Field c:Landroid/arch/lifecycle/k;
      19: return

  void a(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #33                 // Field d:Z
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #33                 // Field d:Z
      14: aload_0
      15: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
      18: invokestatic  #36                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/LiveData;)I
      21: istore_2
      22: iconst_1
      23: istore_3
      24: iload_2
      25: ifne          33
      28: iconst_1
      29: istore_2
      30: goto          35
      33: iconst_0
      34: istore_2
      35: aload_0
      36: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
      39: astore        5
      41: aload         5
      43: invokestatic  #36                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/LiveData;)I
      46: istore        4
      48: aload_0
      49: getfield      #33                 // Field d:Z
      52: ifeq          58
      55: goto          60
      58: iconst_m1
      59: istore_3
      60: aload         5
      62: iload         4
      64: iload_3
      65: iadd
      66: invokestatic  #39                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/LiveData;I)I
      69: pop
      70: iload_2
      71: ifeq          88
      74: aload_0
      75: getfield      #33                 // Field d:Z
      78: ifeq          88
      81: aload_0
      82: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
      85: invokevirtual #42                 // Method android/arch/lifecycle/LiveData.b:()V
      88: aload_0
      89: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
      92: invokestatic  #36                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/LiveData;)I
      95: ifne          112
      98: aload_0
      99: getfield      #33                 // Field d:Z
     102: ifne          112
     105: aload_0
     106: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
     109: invokevirtual #44                 // Method android/arch/lifecycle/LiveData.c:()V
     112: aload_0
     113: getfield      #33                 // Field d:Z
     116: ifeq          127
     119: aload_0
     120: getfield      #20                 // Field f:Landroid/arch/lifecycle/LiveData;
     123: aload_0
     124: invokestatic  #47                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/LiveData$a;)V
     127: return

  abstract boolean a();

  boolean a(android.arch.lifecycle.e);
    Code:
       0: iconst_0
       1: ireturn

  void b();
    Code:
       0: return
}

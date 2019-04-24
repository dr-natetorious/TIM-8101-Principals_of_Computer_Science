class android.support.design.widget.k {
  static android.support.design.widget.k a();
    Code:
       0: getstatic     #45                 // Field a:Landroid/support/design/widget/k;
       3: ifnonnull     16
       6: new           #2                  // class android/support/design/widget/k
       9: dup
      10: invokespecial #46                 // Method "<init>":()V
      13: putstatic     #45                 // Field a:Landroid/support/design/widget/k;
      16: getstatic     #45                 // Field a:Landroid/support/design/widget/k;
      19: areturn

  public void a(android.support.design.widget.k$a);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifeq          31
      15: aload_0
      16: aconst_null
      17: putfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      20: aload_0
      21: getfield      #65                 // Field e:Landroid/support/design/widget/k$b;
      24: ifnull        31
      27: aload_0
      28: invokespecial #93                 // Method b:()V
      31: aload_2
      32: monitorexit
      33: return
      34: astore_1
      35: aload_2
      36: monitorexit
      37: aload_1
      38: athrow
    Exception table:
       from    to  target type
           7    31    34   any
          31    33    34   any
          35    37    34   any

  public void a(android.support.design.widget.k$a, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_3
       5: aload_3
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifeq          30
      15: aload_0
      16: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      19: astore_1
      20: aload_0
      21: aload_1
      22: iload_2
      23: invokespecial #96                 // Method a:(Landroid/support/design/widget/k$b;I)Z
      26: pop
      27: goto          46
      30: aload_0
      31: aload_1
      32: invokespecial #98                 // Method g:(Landroid/support/design/widget/k$a;)Z
      35: ifeq          46
      38: aload_0
      39: getfield      #65                 // Field e:Landroid/support/design/widget/k$b;
      42: astore_1
      43: goto          20
      46: aload_3
      47: monitorexit
      48: return
      49: astore_1
      50: aload_3
      51: monitorexit
      52: aload_1
      53: athrow
    Exception table:
       from    to  target type
           7    20    49   any
          20    27    49   any
          30    43    49   any
          46    48    49   any
          50    52    49   any

  void a(android.support.design.widget.k$b);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      11: aload_1
      12: if_acmpeq     23
      15: aload_0
      16: getfield      #65                 // Field e:Landroid/support/design/widget/k$b;
      19: aload_1
      20: if_acmpne     30
      23: aload_0
      24: aload_1
      25: iconst_2
      26: invokespecial #96                 // Method a:(Landroid/support/design/widget/k$b;I)Z
      29: pop
      30: aload_2
      31: monitorexit
      32: return
      33: astore_1
      34: aload_2
      35: monitorexit
      36: aload_1
      37: athrow
    Exception table:
       from    to  target type
           7    23    33   any
          23    30    33   any
          30    32    33   any
          34    36    33   any

  public void b(android.support.design.widget.k$a);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifeq          23
      15: aload_0
      16: aload_0
      17: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      20: invokespecial #100                // Method b:(Landroid/support/design/widget/k$b;)V
      23: aload_2
      24: monitorexit
      25: return
      26: astore_1
      27: aload_2
      28: monitorexit
      29: aload_1
      30: athrow
    Exception table:
       from    to  target type
           7    23    26   any
          23    25    26   any
          27    29    26   any

  public void c(android.support.design.widget.k$a);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifeq          44
      15: aload_0
      16: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      19: getfield      #103                // Field android/support/design/widget/k$b.c:Z
      22: ifne          44
      25: aload_0
      26: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      29: iconst_1
      30: putfield      #103                // Field android/support/design/widget/k$b.c:Z
      33: aload_0
      34: getfield      #41                 // Field c:Landroid/os/Handler;
      37: aload_0
      38: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      41: invokevirtual #60                 // Method android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
      44: aload_2
      45: monitorexit
      46: return
      47: astore_1
      48: aload_2
      49: monitorexit
      50: aload_1
      51: athrow
    Exception table:
       from    to  target type
           7    44    47   any
          44    46    47   any
          48    50    47   any

  public void d(android.support.design.widget.k$a);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifeq          41
      15: aload_0
      16: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      19: getfield      #103                // Field android/support/design/widget/k$b.c:Z
      22: ifeq          41
      25: aload_0
      26: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      29: iconst_0
      30: putfield      #103                // Field android/support/design/widget/k$b.c:Z
      33: aload_0
      34: aload_0
      35: getfield      #67                 // Field d:Landroid/support/design/widget/k$b;
      38: invokespecial #100                // Method b:(Landroid/support/design/widget/k$b;)V
      41: aload_2
      42: monitorexit
      43: return
      44: astore_1
      45: aload_2
      46: monitorexit
      47: aload_1
      48: athrow
    Exception table:
       from    to  target type
           7    41    44   any
          41    43    44   any
          45    47    44   any

  public boolean e(android.support.design.widget.k$a);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/Object;
       4: astore_3
       5: aload_3
       6: monitorenter
       7: aload_0
       8: aload_1
       9: invokespecial #91                 // Method f:(Landroid/support/design/widget/k$a;)Z
      12: ifne          40
      15: aload_0
      16: aload_1
      17: invokespecial #98                 // Method g:(Landroid/support/design/widget/k$a;)Z
      20: ifeq          35
      23: goto          40
      26: aload_3
      27: monitorexit
      28: iload_2
      29: ireturn
      30: astore_1
      31: aload_3
      32: monitorexit
      33: aload_1
      34: athrow
      35: iconst_0
      36: istore_2
      37: goto          26
      40: iconst_1
      41: istore_2
      42: goto          26
    Exception table:
       from    to  target type
           7    23    30   any
          26    28    30   any
          31    33    30   any
}

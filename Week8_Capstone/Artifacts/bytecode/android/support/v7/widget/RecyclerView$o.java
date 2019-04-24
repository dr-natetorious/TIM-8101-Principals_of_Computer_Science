public class android.support.v7.widget.RecyclerView$o {
  android.util.SparseArray<android.support.v7.widget.RecyclerView$o$a> a;

  public android.support.v7.widget.RecyclerView$o();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #20                 // class android/util/SparseArray
       8: dup
       9: invokespecial #21                 // Method android/util/SparseArray."<init>":()V
      12: putfield      #23                 // Field a:Landroid/util/SparseArray;
      15: aload_0
      16: iconst_0
      17: putfield      #25                 // Field b:I
      20: return

  long a(long, long);
    Code:
       0: lload_1
       1: lconst_0
       2: lcmp
       3: ifne          8
       6: lload_3
       7: lreturn
       8: lload_1
       9: ldc2_w        #38                 // long 4l
      12: ldiv
      13: ldc2_w        #40                 // long 3l
      16: lmul
      17: lload_3
      18: ldc2_w        #38                 // long 4l
      21: ldiv
      22: ladd
      23: lreturn

  public android.support.v7.widget.RecyclerView$x a(int);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/util/SparseArray;
       4: iload_1
       5: invokevirtual #31                 // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
       8: checkcast     #9                  // class android/support/v7/widget/RecyclerView$o$a
      11: astore_2
      12: aload_2
      13: ifnull        45
      16: aload_2
      17: getfield      #45                 // Field android/support/v7/widget/RecyclerView$o$a.a:Ljava/util/ArrayList;
      20: invokevirtual #51                 // Method java/util/ArrayList.isEmpty:()Z
      23: ifne          45
      26: aload_2
      27: getfield      #45                 // Field android/support/v7/widget/RecyclerView$o$a.a:Ljava/util/ArrayList;
      30: astore_2
      31: aload_2
      32: aload_2
      33: invokevirtual #55                 // Method java/util/ArrayList.size:()I
      36: iconst_1
      37: isub
      38: invokevirtual #58                 // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      41: checkcast     #60                 // class android/support/v7/widget/RecyclerView$x
      44: areturn
      45: aconst_null
      46: areturn

  public void a();
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: aload_0
       4: getfield      #23                 // Field a:Landroid/util/SparseArray;
       7: invokevirtual #61                 // Method android/util/SparseArray.size:()I
      10: if_icmpge     37
      13: aload_0
      14: getfield      #23                 // Field a:Landroid/util/SparseArray;
      17: iload_1
      18: invokevirtual #64                 // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      21: checkcast     #9                  // class android/support/v7/widget/RecyclerView$o$a
      24: getfield      #45                 // Field android/support/v7/widget/RecyclerView$o$a.a:Ljava/util/ArrayList;
      27: invokevirtual #67                 // Method java/util/ArrayList.clear:()V
      30: iload_1
      31: iconst_1
      32: iadd
      33: istore_1
      34: goto          2
      37: return

  void a(int, long);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #70                 // Method b:(I)Landroid/support/v7/widget/RecyclerView$o$a;
       5: astore        4
       7: aload         4
       9: aload_0
      10: aload         4
      12: getfield      #74                 // Field android/support/v7/widget/RecyclerView$o$a.c:J
      15: lload_2
      16: invokevirtual #76                 // Method a:(JJ)J
      19: putfield      #74                 // Field android/support/v7/widget/RecyclerView$o$a.c:J
      22: return

  void a(android.support.v7.widget.RecyclerView$a);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #25                 // Field b:I
       5: iconst_1
       6: iadd
       7: putfield      #25                 // Field b:I
      10: return

  void a(android.support.v7.widget.RecyclerView$a, android.support.v7.widget.RecyclerView$a, boolean);
    Code:
       0: aload_1
       1: ifnull        8
       4: aload_0
       5: invokevirtual #80                 // Method b:()V
       8: iload_3
       9: ifne          23
      12: aload_0
      13: getfield      #25                 // Field b:I
      16: ifne          23
      19: aload_0
      20: invokevirtual #82                 // Method a:()V
      23: aload_2
      24: ifnull        32
      27: aload_0
      28: aload_2
      29: invokevirtual #84                 // Method a:(Landroid/support/v7/widget/RecyclerView$a;)V
      32: return

  public void a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: invokevirtual #88                 // Method android/support/v7/widget/RecyclerView$x.h:()I
       4: istore_2
       5: aload_0
       6: iload_2
       7: invokespecial #70                 // Method b:(I)Landroid/support/v7/widget/RecyclerView$o$a;
      10: getfield      #45                 // Field android/support/v7/widget/RecyclerView$o$a.a:Ljava/util/ArrayList;
      13: astore_3
      14: aload_0
      15: getfield      #23                 // Field a:Landroid/util/SparseArray;
      18: iload_2
      19: invokevirtual #31                 // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
      22: checkcast     #9                  // class android/support/v7/widget/RecyclerView$o$a
      25: getfield      #89                 // Field android/support/v7/widget/RecyclerView$o$a.b:I
      28: aload_3
      29: invokevirtual #55                 // Method java/util/ArrayList.size:()I
      32: if_icmpgt     36
      35: return
      36: aload_1
      37: invokevirtual #92                 // Method android/support/v7/widget/RecyclerView$x.v:()V
      40: aload_3
      41: aload_1
      42: invokevirtual #96                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      45: pop
      46: return

  boolean a(int, long, long);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #70                 // Method b:(I)Landroid/support/v7/widget/RecyclerView$o$a;
       5: getfield      #74                 // Field android/support/v7/widget/RecyclerView$o$a.c:J
       8: lstore        6
      10: lload         6
      12: lconst_0
      13: lcmp
      14: ifeq          32
      17: lload_2
      18: lload         6
      20: ladd
      21: lload         4
      23: lcmp
      24: ifge          30
      27: goto          32
      30: iconst_0
      31: ireturn
      32: iconst_1
      33: ireturn

  void b();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #25                 // Field b:I
       5: iconst_1
       6: isub
       7: putfield      #25                 // Field b:I
      10: return

  void b(int, long);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #70                 // Method b:(I)Landroid/support/v7/widget/RecyclerView$o$a;
       5: astore        4
       7: aload         4
       9: aload_0
      10: aload         4
      12: getfield      #100                // Field android/support/v7/widget/RecyclerView$o$a.d:J
      15: lload_2
      16: invokevirtual #76                 // Method a:(JJ)J
      19: putfield      #100                // Field android/support/v7/widget/RecyclerView$o$a.d:J
      22: return

  boolean b(int, long, long);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #70                 // Method b:(I)Landroid/support/v7/widget/RecyclerView$o$a;
       5: getfield      #100                // Field android/support/v7/widget/RecyclerView$o$a.d:J
       8: lstore        6
      10: lload         6
      12: lconst_0
      13: lcmp
      14: ifeq          32
      17: lload_2
      18: lload         6
      20: ladd
      21: lload         4
      23: lcmp
      24: ifge          30
      27: goto          32
      30: iconst_0
      31: ireturn
      32: iconst_1
      33: ireturn
}

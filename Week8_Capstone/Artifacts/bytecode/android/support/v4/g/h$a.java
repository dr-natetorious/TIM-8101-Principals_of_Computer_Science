final class android.support.v4.g.h$a<T> implements java.util.Iterator<T> {
  final int a;

  int b;

  int c;

  boolean d;

  final android.support.v4.g.h e;

  android.support.v4.g.h$a(android.support.v4.g.h, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field e:Landroid/support/v4/g/h;
       5: aload_0
       6: invokespecial #24                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iconst_0
      11: putfield      #26                 // Field d:Z
      14: aload_0
      15: iload_2
      16: putfield      #28                 // Field a:I
      19: aload_0
      20: aload_1
      21: invokevirtual #31                 // Method android/support/v4/g/h.a:()I
      24: putfield      #33                 // Field b:I
      27: return

  public boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #38                 // Field c:I
       4: aload_0
       5: getfield      #33                 // Field b:I
       8: if_icmpge     13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public T next();
    Code:
       0: aload_0
       1: invokevirtual #42                 // Method hasNext:()Z
       4: ifne          15
       7: new           #44                 // class java/util/NoSuchElementException
      10: dup
      11: invokespecial #45                 // Method java/util/NoSuchElementException."<init>":()V
      14: athrow
      15: aload_0
      16: getfield      #21                 // Field e:Landroid/support/v4/g/h;
      19: aload_0
      20: getfield      #38                 // Field c:I
      23: aload_0
      24: getfield      #28                 // Field a:I
      27: invokevirtual #48                 // Method android/support/v4/g/h.a:(II)Ljava/lang/Object;
      30: astore_1
      31: aload_0
      32: aload_0
      33: getfield      #38                 // Field c:I
      36: iconst_1
      37: iadd
      38: putfield      #38                 // Field c:I
      41: aload_0
      42: iconst_1
      43: putfield      #26                 // Field d:Z
      46: aload_1
      47: areturn

  public void remove();
    Code:
       0: aload_0
       1: getfield      #26                 // Field d:Z
       4: ifne          15
       7: new           #53                 // class java/lang/IllegalStateException
      10: dup
      11: invokespecial #54                 // Method java/lang/IllegalStateException."<init>":()V
      14: athrow
      15: aload_0
      16: aload_0
      17: getfield      #38                 // Field c:I
      20: iconst_1
      21: isub
      22: putfield      #38                 // Field c:I
      25: aload_0
      26: aload_0
      27: getfield      #33                 // Field b:I
      30: iconst_1
      31: isub
      32: putfield      #33                 // Field b:I
      35: aload_0
      36: iconst_0
      37: putfield      #26                 // Field d:Z
      40: aload_0
      41: getfield      #21                 // Field e:Landroid/support/v4/g/h;
      44: aload_0
      45: getfield      #38                 // Field c:I
      48: invokevirtual #57                 // Method android/support/v4/g/h.a:(I)V
      51: return
}

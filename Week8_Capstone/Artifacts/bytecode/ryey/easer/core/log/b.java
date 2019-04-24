public abstract class ryey.easer.core.log.b implements ryey.easer.core.log.a {
  public static final ryey.easer.core.log.b$a a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/core/log/b$a
       3: dup
       4: aconst_null
       5: invokespecial #20                 // Method ryey/easer/core/log/b$a."<init>":(La/b/b/a;)V
       8: putstatic     #22                 // Field a:Lryey/easer/core/log/b$a;
      11: return

  protected ryey.easer.core.log.b(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #26                 // String parcel
       3: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokespecial #33                 // Method java/lang/Object."<init>":()V
      10: aload_0
      11: aload_1
      12: invokevirtual #39                 // Method android/os/Parcel.readLong:()J
      15: putfield      #41                 // Field b:J
      18: aload_0
      19: aload_1
      20: invokevirtual #45                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      23: putfield      #47                 // Field c:Ljava/lang/String;
      26: return

  public ryey.easer.core.log.b(java.lang.String, long);
    Code:
       0: aload_0
       1: invokespecial #33                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: lload_2
       6: putfield      #41                 // Field b:J
       9: aload_0
      10: aload_1
      11: putfield      #47                 // Field c:Ljava/lang/String;
      14: return

  public ryey.easer.core.log.b(java.lang.String, long, int, a.b.b.a);
    Code:
       0: iload         4
       2: iconst_1
       3: iand
       4: ifeq          12
       7: aconst_null
       8: checkcast     #51                 // class java/lang/String
      11: astore_1
      12: iload         4
      14: iconst_2
      15: iand
      16: ifeq          26
      19: getstatic     #22                 // Field a:Lryey/easer/core/log/b$a;
      22: invokestatic  #54                 // Method ryey/easer/core/log/b$a.a:(Lryey/easer/core/log/b$a;)J
      25: lstore_2
      26: aload_0
      27: aload_1
      28: lload_2
      29: invokespecial #56                 // Method "<init>":(Ljava/lang/String;J)V
      32: return

  public final long a();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:J
       4: lreturn

  public final java.lang.String b();
    Code:
       0: aload_0
       1: getfield      #47                 // Field c:Ljava/lang/String;
       4: areturn

  public final long c();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:J
       4: lreturn

  public final java.lang.String d();
    Code:
       0: aload_0
       1: getfield      #47                 // Field c:Ljava/lang/String;
       4: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: checkcast     #2                  // class ryey/easer/core/log/b
       5: if_acmpne     10
       8: iconst_1
       9: ireturn
      10: aload_1
      11: ifnull        64
      14: aload_1
      15: instanceof    #63                 // class ryey/easer/core/log/c
      18: ifne          23
      21: iconst_0
      22: ireturn
      23: aload_0
      24: getfield      #41                 // Field b:J
      27: lstore_2
      28: aload_1
      29: checkcast     #63                 // class ryey/easer/core/log/c
      32: astore_1
      33: lload_2
      34: aload_1
      35: invokevirtual #65                 // Method ryey/easer/core/log/c.c:()J
      38: lcmp
      39: ifeq          44
      42: iconst_0
      43: ireturn
      44: aload_0
      45: getfield      #47                 // Field c:Ljava/lang/String;
      48: aload_1
      49: invokevirtual #67                 // Method ryey/easer/core/log/c.d:()Ljava/lang/String;
      52: invokestatic  #70                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      55: iconst_1
      56: ixor
      57: ifeq          62
      60: iconst_0
      61: ireturn
      62: iconst_1
      63: ireturn
      64: iconst_0
      65: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:J
       4: invokestatic  #77                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       7: invokevirtual #79                 // Method java/lang/Object.hashCode:()I
      10: istore_2
      11: aload_0
      12: getfield      #47                 // Field c:Ljava/lang/String;
      15: astore_3
      16: aload_3
      17: ifnull        28
      20: aload_3
      21: invokevirtual #80                 // Method java/lang/String.hashCode:()I
      24: istore_1
      25: goto          30
      28: iconst_0
      29: istore_1
      30: iload_2
      31: bipush        31
      33: imul
      34: iload_1
      35: iadd
      36: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: ldc           #26                 // String parcel
       3: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: aload_0
       8: getfield      #41                 // Field b:J
      11: invokevirtual #86                 // Method android/os/Parcel.writeLong:(J)V
      14: aload_1
      15: aload_0
      16: getfield      #47                 // Field c:Ljava/lang/String;
      19: invokevirtual #90                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      22: return
}

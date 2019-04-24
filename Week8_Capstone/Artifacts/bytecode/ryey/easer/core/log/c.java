public final class ryey.easer.core.log.c extends ryey.easer.core.log.b {
  public static final ryey.easer.core.log.c$a CREATOR;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/log/c$a
       3: dup
       4: aconst_null
       5: invokespecial #17                 // Method ryey/easer/core/log/c$a."<init>":(La/b/b/a;)V
       8: putstatic     #19                 // Field CREATOR:Lryey/easer/core/log/c$a;
      11: return

  public ryey.easer.core.log.c(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #23                 // String parcel
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: invokespecial #30                 // Method ryey/easer/core/log/b."<init>":(Landroid/os/Parcel;)V
      11: aload_1
      12: invokevirtual #36                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      15: astore_1
      16: aload_1
      17: ldc           #38                 // String parcel.readString()
      19: invokestatic  #40                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      22: aload_0
      23: aload_1
      24: putfield      #42                 // Field b:Ljava/lang/String;
      27: return

  public ryey.easer.core.log.c(java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #45                 // String profile
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_2
       8: lconst_0
       9: iconst_2
      10: aconst_null
      11: invokespecial #48                 // Method ryey/easer/core/log/b."<init>":(Ljava/lang/String;JILa/b/b/a;)V
      14: aload_0
      15: aload_1
      16: putfield      #42                 // Field b:Ljava/lang/String;
      19: return

  public final java.lang.String e();
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:Ljava/lang/String;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #53                 // Method ryey/easer/core/log/b.equals:(Ljava/lang/Object;)Z
       5: ifne          10
       8: iconst_0
       9: ireturn
      10: aload_1
      11: ifnonnull     24
      14: new           #55                 // class a/b
      17: dup
      18: ldc           #57                 // String null cannot be cast to non-null type ryey.easer.core.log.ProfileLoadedLog
      20: invokespecial #60                 // Method a/b."<init>":(Ljava/lang/String;)V
      23: athrow
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/core/log/c
      28: astore_1
      29: aload_0
      30: getfield      #42                 // Field b:Ljava/lang/String;
      33: aload_1
      34: getfield      #42                 // Field b:Ljava/lang/String;
      37: invokestatic  #65                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: ifne          45
      43: iconst_0
      44: ireturn
      45: iconst_1
      46: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokespecial #69                 // Method ryey/easer/core/log/b.hashCode:()I
       4: bipush        31
       6: imul
       7: aload_0
       8: getfield      #42                 // Field b:Ljava/lang/String;
      11: invokevirtual #72                 // Method java/lang/String.hashCode:()I
      14: iadd
      15: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: ldc           #23                 // String parcel
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: iload_2
       9: invokespecial #76                 // Method ryey/easer/core/log/b.writeToParcel:(Landroid/os/Parcel;I)V
      12: aload_1
      13: aload_0
      14: getfield      #42                 // Field b:Ljava/lang/String;
      17: invokevirtual #79                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: return
}

public final class android.support.v4.app.ag {
  static android.app.RemoteInput a(android.support.v4.app.ag);
    Code:
       0: new           #20                 // class android/app/RemoteInput$Builder
       3: dup
       4: aload_0
       5: invokevirtual #23                 // Method a:()Ljava/lang/String;
       8: invokespecial #27                 // Method android/app/RemoteInput$Builder."<init>":(Ljava/lang/String;)V
      11: aload_0
      12: invokevirtual #30                 // Method b:()Ljava/lang/CharSequence;
      15: invokevirtual #34                 // Method android/app/RemoteInput$Builder.setLabel:(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
      18: aload_0
      19: invokevirtual #37                 // Method c:()[Ljava/lang/CharSequence;
      22: invokevirtual #41                 // Method android/app/RemoteInput$Builder.setChoices:([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
      25: aload_0
      26: invokevirtual #44                 // Method e:()Z
      29: invokevirtual #48                 // Method android/app/RemoteInput$Builder.setAllowFreeFormInput:(Z)Landroid/app/RemoteInput$Builder;
      32: aload_0
      33: invokevirtual #51                 // Method f:()Landroid/os/Bundle;
      36: invokevirtual #55                 // Method android/app/RemoteInput$Builder.addExtras:(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;
      39: invokevirtual #59                 // Method android/app/RemoteInput$Builder.build:()Landroid/app/RemoteInput;
      42: areturn

  static android.app.RemoteInput[] a(android.support.v4.app.ag[]);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: arraylength
       8: anewarray     #63                 // class android/app/RemoteInput
      11: astore_2
      12: iconst_0
      13: istore_1
      14: iload_1
      15: aload_0
      16: arraylength
      17: if_icmpge     36
      20: aload_2
      21: iload_1
      22: aload_0
      23: iload_1
      24: aaload
      25: invokestatic  #65                 // Method a:(Landroid/support/v4/app/ag;)Landroid/app/RemoteInput;
      28: aastore
      29: iload_1
      30: iconst_1
      31: iadd
      32: istore_1
      33: goto          14
      36: aload_2
      37: areturn

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #67                 // Field a:Ljava/lang/String;
       4: areturn

  public java.lang.CharSequence b();
    Code:
       0: aload_0
       1: getfield      #69                 // Field b:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.CharSequence[] c();
    Code:
       0: aload_0
       1: getfield      #71                 // Field c:[Ljava/lang/CharSequence;
       4: areturn

  public java.util.Set<java.lang.String> d();
    Code:
       0: aload_0
       1: getfield      #74                 // Field f:Ljava/util/Set;
       4: areturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #78                 // Field d:Z
       4: ireturn

  public android.os.Bundle f();
    Code:
       0: aload_0
       1: getfield      #80                 // Field e:Landroid/os/Bundle;
       4: areturn
}

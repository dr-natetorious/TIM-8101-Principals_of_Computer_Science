public final class ryey.easer.core.ui.data.script.ListDynamicsActivity$EditDynamicsActivity$a {
  public final java.lang.String a;

  public final java.lang.String b;

  ryey.easer.core.ui.data.script.ListDynamicsActivity$EditDynamicsActivity$a(java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #21                 // Field b:Ljava/lang/String;
      14: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        36
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/core/ui/data/script/ListDynamicsActivity$EditDynamicsActivity$a
      15: ifne          21
      18: goto          36
      21: aload_0
      22: getfield      #19                 // Field a:Ljava/lang/String;
      25: aload_1
      26: checkcast     #2                  // class ryey/easer/core/ui/data/script/ListDynamicsActivity$EditDynamicsActivity$a
      29: getfield      #19                 // Field a:Ljava/lang/String;
      32: invokevirtual #28                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      35: ireturn
      36: iconst_0
      37: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Ljava/lang/String;
       4: ifnull        12
       7: aload_0
       8: getfield      #21                 // Field b:Ljava/lang/String;
      11: areturn
      12: aload_0
      13: getfield      #19                 // Field a:Ljava/lang/String;
      16: areturn
}

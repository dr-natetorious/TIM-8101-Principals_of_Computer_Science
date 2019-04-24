final class android.support.v4.a.c$b {
  final android.content.IntentFilter a;

  final android.content.BroadcastReceiver b;

  boolean c;

  boolean d;

  android.support.v4.a.c$b(android.content.IntentFilter, android.content.BroadcastReceiver);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #20                 // Field a:Landroid/content/IntentFilter;
       9: aload_0
      10: aload_2
      11: putfield      #22                 // Field b:Landroid/content/BroadcastReceiver;
      14: return

  public java.lang.String toString();
    Code:
       0: new           #27                 // class java/lang/StringBuilder
       3: dup
       4: sipush        128
       7: invokespecial #30                 // Method java/lang/StringBuilder."<init>":(I)V
      10: astore_1
      11: aload_1
      12: ldc           #32                 // String Receiver{
      14: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_1
      19: aload_0
      20: getfield      #22                 // Field b:Landroid/content/BroadcastReceiver;
      23: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #41                 // String  filter=
      30: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #20                 // Field a:Landroid/content/IntentFilter;
      39: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      42: pop
      43: aload_0
      44: getfield      #43                 // Field d:Z
      47: ifeq          57
      50: aload_1
      51: ldc           #45                 // String  DEAD
      53: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      56: pop
      57: aload_1
      58: ldc           #47                 // String }
      60: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_1
      65: invokevirtual #49                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      68: areturn
}

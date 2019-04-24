public class com.b.a.k implements com.b.a.e {
  com.b.a.k(com.b.a.k$a, com.b.a.k$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #43                 // Method "<init>":(Lcom/b/a/k$a;)V
       5: return

  public static com.b.a.k$a a();
    Code:
       0: new           #10                 // class com/b/a/k$a
       3: dup
       4: aconst_null
       5: invokespecial #69                 // Method com/b/a/k$a."<init>":(Lcom/b/a/k$1;)V
       8: areturn

  public void a(int, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: aload_2
       2: invokespecial #177                // Method b:(Ljava/lang/String;)Ljava/lang/String;
       5: astore_2
       6: aload_0
       7: iload_1
       8: aload_2
       9: invokespecial #179                // Method a:(ILjava/lang/String;)V
      12: aload_0
      13: iload_1
      14: aload_2
      15: aload_0
      16: getfield      #27                 // Field a:I
      19: invokespecial #181                // Method a:(ILjava/lang/String;I)V
      22: aload_3
      23: invokevirtual #185                // Method java/lang/String.getBytes:()[B
      26: astore        6
      28: aload         6
      30: arraylength
      31: istore        5
      33: iload         5
      35: sipush        4000
      38: if_icmpgt     68
      41: aload_0
      42: getfield      #27                 // Field a:I
      45: ifle          54
      48: aload_0
      49: iload_1
      50: aload_2
      51: invokespecial #112                // Method c:(ILjava/lang/String;)V
      54: aload_0
      55: iload_1
      56: aload_2
      57: aload_3
      58: invokespecial #187                // Method b:(ILjava/lang/String;Ljava/lang/String;)V
      61: aload_0
      62: iload_1
      63: aload_2
      64: invokespecial #189                // Method b:(ILjava/lang/String;)V
      67: return
      68: aload_0
      69: getfield      #27                 // Field a:I
      72: ifle          81
      75: aload_0
      76: iload_1
      77: aload_2
      78: invokespecial #112                // Method c:(ILjava/lang/String;)V
      81: iconst_0
      82: istore        4
      84: iload         4
      86: iload         5
      88: if_icmpge     130
      91: aload_0
      92: iload_1
      93: aload_2
      94: new           #59                 // class java/lang/String
      97: dup
      98: aload         6
     100: iload         4
     102: iload         5
     104: iload         4
     106: isub
     107: sipush        4000
     110: invokestatic  #195                // Method java/lang/Math.min:(II)I
     113: invokespecial #198                // Method java/lang/String."<init>":([BII)V
     116: invokespecial #187                // Method b:(ILjava/lang/String;Ljava/lang/String;)V
     119: iload         4
     121: sipush        4000
     124: iadd
     125: istore        4
     127: goto          84
     130: aload_0
     131: iload_1
     132: aload_2
     133: invokespecial #189                // Method b:(ILjava/lang/String;)V
     136: return
}

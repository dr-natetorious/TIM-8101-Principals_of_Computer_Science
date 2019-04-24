public final class android.support.v4.f.a {
  public android.support.v4.f.a(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.util.List<byte[]>>);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #24                 // Method android/support/v4/g/l.a:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #26                 // class java/lang/String
      12: putfield      #28                 // Field a:Ljava/lang/String;
      15: aload_0
      16: aload_2
      17: invokestatic  #24                 // Method android/support/v4/g/l.a:(Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #26                 // class java/lang/String
      23: putfield      #30                 // Field b:Ljava/lang/String;
      26: aload_0
      27: aload_3
      28: invokestatic  #24                 // Method android/support/v4/g/l.a:(Ljava/lang/Object;)Ljava/lang/Object;
      31: checkcast     #26                 // class java/lang/String
      34: putfield      #32                 // Field c:Ljava/lang/String;
      37: aload_0
      38: aload         4
      40: invokestatic  #24                 // Method android/support/v4/g/l.a:(Ljava/lang/Object;)Ljava/lang/Object;
      43: checkcast     #34                 // class java/util/List
      46: putfield      #36                 // Field d:Ljava/util/List;
      49: aload_0
      50: iconst_0
      51: putfield      #38                 // Field e:I
      54: new           #40                 // class java/lang/StringBuilder
      57: dup
      58: aload_0
      59: getfield      #28                 // Field a:Ljava/lang/String;
      62: invokespecial #43                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
      65: astore_1
      66: aload_1
      67: ldc           #45                 // String -
      69: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: pop
      73: aload_1
      74: aload_0
      75: getfield      #30                 // Field b:Ljava/lang/String;
      78: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload_1
      83: ldc           #45                 // String -
      85: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      88: pop
      89: aload_1
      90: aload_0
      91: getfield      #32                 // Field c:Ljava/lang/String;
      94: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      97: pop
      98: aload_0
      99: aload_1
     100: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     103: putfield      #55                 // Field f:Ljava/lang/String;
     106: return

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/lang/String;
       4: areturn

  public java.lang.String b();
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Ljava/lang/String;
       4: areturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: getfield      #32                 // Field c:Ljava/lang/String;
       4: areturn

  public java.util.List<java.util.List<byte[]>> d();
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/util/List;
       4: areturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #38                 // Field e:I
       4: ireturn

  public java.lang.String f();
    Code:
       0: aload_0
       1: getfield      #55                 // Field f:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #40                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_3
       8: new           #40                 // class java/lang/StringBuilder
      11: dup
      12: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
      15: astore        4
      17: aload         4
      19: ldc           #64                 // String FontRequest {mProviderAuthority:
      21: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload         4
      27: aload_0
      28: getfield      #28                 // Field a:Ljava/lang/String;
      31: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload         4
      37: ldc           #66                 // String , mProviderPackage:
      39: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      42: pop
      43: aload         4
      45: aload_0
      46: getfield      #30                 // Field b:Ljava/lang/String;
      49: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload         4
      55: ldc           #68                 // String , mQuery:
      57: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: aload         4
      63: aload_0
      64: getfield      #32                 // Field c:Ljava/lang/String;
      67: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      70: pop
      71: aload         4
      73: ldc           #70                 // String , mCertificates:
      75: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_3
      80: aload         4
      82: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      85: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      88: pop
      89: iconst_0
      90: istore_1
      91: iload_1
      92: aload_0
      93: getfield      #36                 // Field d:Ljava/util/List;
      96: invokeinterface #73,  1           // InterfaceMethod java/util/List.size:()I
     101: if_icmpge     194
     104: aload_3
     105: ldc           #75                 // String  [
     107: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     110: pop
     111: aload_0
     112: getfield      #36                 // Field d:Ljava/util/List;
     115: iload_1
     116: invokeinterface #79,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     121: checkcast     #34                 // class java/util/List
     124: astore        4
     126: iconst_0
     127: istore_2
     128: iload_2
     129: aload         4
     131: invokeinterface #73,  1           // InterfaceMethod java/util/List.size:()I
     136: if_icmpge     180
     139: aload_3
     140: ldc           #81                 // String  \"
     142: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     145: pop
     146: aload_3
     147: aload         4
     149: iload_2
     150: invokeinterface #79,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     155: checkcast     #83                 // class "[B"
     158: iconst_0
     159: invokestatic  #89                 // Method android/util/Base64.encodeToString:([BI)Ljava/lang/String;
     162: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     165: pop
     166: aload_3
     167: ldc           #91                 // String \"
     169: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     172: pop
     173: iload_2
     174: iconst_1
     175: iadd
     176: istore_2
     177: goto          128
     180: aload_3
     181: ldc           #93                 // String  ]
     183: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     186: pop
     187: iload_1
     188: iconst_1
     189: iadd
     190: istore_1
     191: goto          91
     194: aload_3
     195: ldc           #95                 // String }
     197: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     200: pop
     201: new           #40                 // class java/lang/StringBuilder
     204: dup
     205: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
     208: astore        4
     210: aload         4
     212: ldc           #97                 // String mCertificatesArray:
     214: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     217: pop
     218: aload         4
     220: aload_0
     221: getfield      #38                 // Field e:I
     224: invokevirtual #100                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     227: pop
     228: aload_3
     229: aload         4
     231: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     234: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     237: pop
     238: aload_3
     239: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     242: areturn
}

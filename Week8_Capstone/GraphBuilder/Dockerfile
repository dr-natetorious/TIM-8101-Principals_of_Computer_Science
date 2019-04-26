FROM microsoft/dotnet:2.1-sdk
LABEL Author="Nate Bachmeier"
LABEL Course="TIM-8101: Prinicpals of Computer Science"
LABEL School="NorthCentral University"

WORKDIR /root

# Install core binaries
RUN apt-get -y update && apt-get -y install \
  default-jdk \
  git \
  zip \
  apktool \
  awscli

# Install dex tools
RUN curl -o dex2jar.zip https://ayera.dl.sourceforge.net/project/dex2jar/dex2jar-2.0.zip \
  && unzip -o dex2jar.zip \
  && chmod +x dex2jar-2.0/*.sh \
  && rm dex2jar-2.0/*.bat \
  && mv dex2jar-2.0 /usr/bin/dex2jar

WORKDIR /src
COPY decompile.sh .
RUN chmod +x decompile.sh 
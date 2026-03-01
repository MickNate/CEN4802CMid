FROM ubuntu:latest
LABEL authors="unkno"

ENTRYPOINT ["top", "-b"]
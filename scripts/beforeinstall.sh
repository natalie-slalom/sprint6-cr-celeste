#!/bin/sh
(! sudo lsof -t -i:8080) || sudo kill -9 $(sudo lsof -t -i:8080)
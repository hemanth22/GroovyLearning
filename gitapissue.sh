#!/bin/bash
body="{ \"title\": \"Travis Build no. $TRAVIS_BUILD_ID failure \", \"body\": \"$TRAVIS_TEST_RESULT\", \"labels\": [\"critical\"]}"

curl -i \
     -H "Travis-API-Version: 3" \
     -H "Authorization: token $TicketApi" \
     -d "$body" \
     https://api.github.com/repos/hemanth22/GroovyLearning/issues

#!/bin/bash
curl -i -H "Authorization: token $TicketApi" -d '{"title": "Travis Build no. $TRAVIS_BUILD_ID failure ", "body": $TRAVIS_TEST_RESULT, "labels": ["critical"]}' https://api.github.com/repos/hemanth22/GroovyLearning/issues
